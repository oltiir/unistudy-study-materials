# 03 - Stacks dhe Queues

## Hape burimin dhe shiko demonstrimin

- [13StacksAndQueues.pdf](../13StacksAndQueues.pdf)
- [3. Stacks Queues - Detyrat e shtëpisë.pdf](../3.%20Stacks%20Queues%20-%20Detyrat%20e%20sht%C3%ABpis%C3%AB.pdf)
- [Stacks and Queues - Detyra të zgjidhura detyra për ushtrime.pdf](../Stacks%20and%20Queues%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.pdf)

**Demonstrimet falas të Princeton-it** (ndali te çdo hap, kopjo gjendjen në letër dhe krahasoje me trace-in e kësaj teme):

- [Dijkstra two-stack (demonstrim .mov)](https://algs4.cs.princeton.edu/lectures/demo/13DemoDijkstraTwoStack.mov)

Skedarët `.mov` janë video të shkurtra demonstrimi; nëse browseri nuk i luan, hapini me një video player. Demonstrimi `PDF` hapet si dokument, nuk është video.

**Si të punosh:** provo vetë detyrën e punuar para se ta lexosh përgjigjen; bëj pastaj detyrën «për ty» dhe kontrollo [ushtrimet e plota me zgjidhje](18-PRAKTIKA-PARA-PROVIMIT.md).

## Burimet e mbuluara

- `13StacksAndQueues.pdf`
- `3. Stacks Queues - Detyrat e shtëpisë.pdf`
- `Stacks and Queues - Detyra të zgjidhura detyra për ushtrime.pdf`

## Konceptet bazë

**Nga PDF-ja e zgjidhjeve:** [konvertimi One-Stack i një shprehjeje reale, me të gjitha vlerat ndërmjetëse](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md#8-one-stack-ruaj-kllapat-në-postfix).

- **Stack**: LIFO - elementi i fundit i futur del i pari. Operacionet `push`, `pop`, `isEmpty`, `size`.
- **Queue**: FIFO - elementi më i vjetër del i pari. Operacionet `enqueue`, `dequeue`, `isEmpty`, `size`.
- Nuk kanë qasje arbitrare si array; klienti përdor vetëm API-në.

## Stack me linked list

Mbahet `first`, që është maja e stack-ut.

```java
void push(Item item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
}

Item pop() {
    Item item = first.item;
    first = first.next;
    return item;
}
```

Të dy operacionet janë `O(1)` worst case. Për `pop` në stack të zbrazët duhet exception/guard.

## Stack me resizing array

- `push`: vendos në `a[N]`, pastaj rrit `N`.
- `pop`: zvogëlo `N`, merre `a[N]`, vendose slotin `null` për të shmangur **loitering**.
- Kur mbushet, dyfisho kapacitetin.
- Kur `N == capacity/4`, përgjysmo kapacitetin.

Pse jo përgjysmim kur është gjysmë i mbushur? Një sekuencë `push-pop` afër kufirit do të shkaktonte resize në çdo operacion. Kufiri 1/4 krijon hapësirë mes rritjes dhe zvogëlimit.

Operacione individuale ndonjëherë kushtojnë `O(N)`, por kostoja amortized është `O(1)`.

## Queue me linked list

Mbahen dy pointerë:

- `first`: elementi që del i pari;
- `last`: vendi ku shtohet elementi i ri.

```java
void enqueue(Item item) {
    Node oldLast = last;
    last = new Node(item, null);
    if (isEmpty()) first = last;
    else oldLast.next = last;
}

Item dequeue() {
    Item item = first.item;
    first = first.next;
    if (isEmpty()) last = null;
    return item;
}
```

Të dyja `O(1)`. Rasti i queue të zbrazët është vendimtar.

## Circular queue me array

Mbahen `head`, `tail`, `size`; indeksi përditësohet me modulo:

`tail = (tail + 1) % capacity`, `head = (head + 1) % capacity`.

Për queue me kapacitet 3, kur insertohet elementi i katërt duhet së pari të ketë një `dequeue` ose të bëhet resize. Në vizatim shkruaj indeksat dhe gjendjen pas çdo operacioni.

## Generics dhe iterators

`Stack<Item>` lejon kontroll tipi në compile time. Për array generik në Java përdoret cast:

```java
Item[] a = (Item[]) new Object[capacity];
```

Një strukturë `Iterable<Item>` kthen `Iterator<Item>` me `hasNext()` dhe `next()`. Iterator-i i stack-ut duhet të ecë nga maja drejt fundit, në rendin e `pop`.

## Infix, postfix dhe precedence

Infix: `A + B * C`; postfix: `A B C * +`.

Rregullat gjatë konvertimit:

1. Operandët dalin direkt në output.
2. `(` futet në operator stack.
3. Për operator të ri, nxirr operatorët me prioritet më të lartë ose të barabartë (për operatorë left-associative), pastaj fute të riun.
4. Për `)`, nxirr deri te `(` dhe largo kllapën.
5. Në fund nxirr operatorët e mbetur.

Prioriteti: `()` > `* /` > `+ -`.

Shembull:

`A + B / (C * D) - E` -> `A B C D * / + E -`.

## Vlerësimi i postfix me one-stack

Lexo tokenët majtas-djathtas:

- operand -> `push`;
- operator -> `right = pop()`, `left = pop()`, llogarit `left op right`, pastaj `push`.

Rendi është kritik për `-` dhe `/`.

## Dijkstra two-stack

Për shprehje plotësisht të kllapëzuar përdor:

- stack të operatorëve;
- stack të vlerave.

Operand -> values; operator -> ops; `(` injorohet; te `)` nxirret operatori dhe operandët, llogaritet dhe rezultati futet te values.

Shembull `(7 - ((4 * 3) + (5 * 4)))`:

- `4*3=12`, `5*4=20`;
- `12+20=32`;
- `7-32=-25`.

## Shembuj të zgjidhur hap pas hapi

### Postfix me një stack

Vlerëso `8 3 + 2 * 6 -`. Kur haset operatori, nxirret së pari operandi i djathtë dhe pastaj i majti.

| Tokeni | Veprimi | Stack pas veprimit |
|---|---|---|
| `8` | push 8 | `[8]` |
| `3` | push 3 | `[8, 3]` |
| `+` | `8 + 3 = 11` | `[11]` |
| `2` | push 2 | `[11, 2]` |
| `*` | `11 * 2 = 22` | `[22]` |
| `6` | push 6 | `[22, 6]` |
| `-` | `22 - 6 = 16` | `[16]` |

Në fund duhet të mbetet saktësisht një vlerë, prandaj rezultati është `16`.

#### Detyrë për ty

Vlerëso `9 2 3 * + 4 /` duke shkruar stack-un pas çdo tokeni. Kontrolli final me pjesëtim **real** është `3.75`; në Java me të gjitha vlerat `int`, `15/4` jep `3`. Specifiko llojin e numrave sipas kërkesës së detyrës.

### Circular queue me kapacitet 3

Nisim me `head = 0`, `tail = 0`, `size = 0`. `tail` tregon slotin ku do të futet elementi i ardhshëm.

| Operacioni | Çfarë ndodh | `head` | `tail` | Queue logjike |
|---|---|---:|---:|---|
| `enq(A)` | A vendoset në indeksin 0 | 0 | 1 | `[A]` |
| `enq(B)` | B vendoset në indeksin 1 | 0 | 2 | `[A, B]` |
| `deq()` | del A; head lëviz | 1 | 2 | `[B]` |
| `enq(C)` | C vendoset në indeksin 2 | 1 | 0 | `[B, C]` |
| `enq(D)` | D vendoset në indeksin 0 | 1 | 1 | `[B, C, D]` |
| `deq()` | del B; head lëviz | 2 | 1 | `[C, D]` |

`tail` kalon nga 2 në 0 sepse `(2 + 1) % 3 = 0`. Elementet e dala janë `A`, pastaj `B`; queue finale është `[C, D]`.

#### Detyrë për ty

Për circular queue me kapacitet 4, nis me `head=tail=size=0` dhe ekzekuto: `enq(K), enq(O), enq(S), deq(), enq(O), enq(V), deq(), enq(A)`. Shkruaj pas çdo hapi array-in fizik, `head`, `tail`, `size` dhe queue-n logjike.

## Aplikime

- call stack dhe rekursioni;
- undo/back;
- parsing dhe JVM;
- BFS queues;
- printer/job scheduling.

## Gabimet tipike

- Ngatërron LIFO me FIFO.
- Te queue nuk e vendos `last=null` pasi hiqet elementi i fundit.
- Te postfix bën `a-b` me pop-et në rend të kundërt.
- Harron `null` pas `pop` në array.
- Në circular queue lëviz indeksin pa modulo.

## Kontrolli i njohurive

1. Pse stack linked-list nuk ka overflow artificial?
2. Pse resize bëhet në 1/4 dhe jo në 1/2 gjatë zvogëlimit?
3. Cili del nga queue pas `enqueue(A), enqueue(B), dequeue()`?
4. Jep postfix për `(A*B)/(C-D*E)+F`.

## Ushtrime

- Zgjidh me one-stack: `((8+3)*2-6)+(12/2)-4`.
- Zgjidh me Dijkstra: `((2+(4*5))-((8*2)/4))`.
- Vizato queue size 3 për: `enq(I), enq(N), deq(), enq(P), enq(U), deq(), deq(), enq(T), deq()`.
