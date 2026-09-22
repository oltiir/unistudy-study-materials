# 09 - Binary Search Trees (BST)

## Burimet e mbuluara

- `32BinarySearchTrees.pdf`
- `BST - Detyra të zgjidhura.pdf`
- `BST - Detyrat e shtëpisë.pdf`

## Rregulla e BST

Për çdo node me key `k`:

- të gjithë keys në subtree majtas janë `< k`;
- të gjithë keys në subtree djathtas janë `> k`.

Node ruan `key`, `value`, `left`, `right` dhe, kur duhet rank/select, `count` të subtree.

Forma varet nga rendi i insertimit. I njëjti set mund të prodhojë tree të balancuar ose një listë të pjerrët.

## Search (`get`)

Fillo në root: key më i vogël -> majtas; më i madh -> djathtas; baraz -> gjetur. Kostoja është `O(h)`, ku `h` është lartësia.

## Insert (`put`)

Search deri te një null link dhe krijo node. Nëse key ekziston, update value.

```java
Node put(Node x, Key key, Value val) {
    if (x==null) return new Node(key,val,1);
    int cmp=key.compareTo(x.key);
    if (cmp<0) x.left=put(x.left,key,val);
    else if (cmp>0) x.right=put(x.right,key,val);
    else x.val=val;
    x.count=1+size(x.left)+size(x.right);
    return x;
}
```

Kthimi i `x` rivendos linkat gjatë kthimit nga rekursioni.

## Lartësia dhe performanca

- Best/balancuar: `h = Theta(log N)`.
- Average për rend random: rreth `1.39 log2 N` krahasime në material.
- Worst për keys të insertuar të sortuar: `h=N-1`, operacionet `O(N)`.

## Min, max, floor, ceiling

- `min`: ec majtas deri sa `left==null`.
- `max`: ec djathtas.
- `floor(k)`: key më i madh `<=k`.
- `ceiling(k)`: key më i vogël `>=k`.

Për floor:

- nëse `k == x.key`, përgjigjja është `x`;
- nëse `k < x.key`, kërko majtas;
- nëse `k > x.key`, provo djathtas; nëse s'ka rezultat, `x` është floor.

## Traversals

| Traversal | Rendi | Përdorimi |
|---|---|---|
| Preorder | Root, Left, Right (`VLR`) | serializim/konstruktim |
| Inorder | Left, Root, Right (`LVR`) | keys në rend rritës në BST |
| Postorder | Left, Right, Root (`LRV`) | fshirje/evaluim bottom-up |

Vërejtje: një fjali në slide thotë gabimisht se inorder jep nga më i madhi te më i vogli; me `left-root-right` rezultati standard është nga më i vogli te më i madhi.

## Rank dhe select

Nëse çdo node mban `count`:

- `rank(k)` përdor madhësinë e subtree majtas;
- `select(r)` gjen node që ka saktësisht `r` keys më të vegjël.

Counts duhet të përditësohen pas insert/delete.

## Delete minimum

Ec majtas. Kur `x.left==null`, kthe `x.right`; pastaj përditëso links dhe count gjatë kthimit.

## Hibbard delete

Pasi gjendet node `x`:

1. Pa fëmijë: kthe `null`.
2. Vetëm një fëmijë: kthe atë fëmijë.
3. Dy fëmijë: zëvendëso me successor-in, minimumin e subtree djathtas; lidhe me `deleteMin(old.right)` dhe me subtree majtas.

```java
Node t=x;
x=min(t.right);
x.right=deleteMin(t.right);
x.left=t.left;
```

Mund të përdoret edhe predecessor-i (max i majtë), por zgjidh një metodë dhe ndiqe konsistent.

## Ndërtimi nga traversals

- Preorder: elementi i parë është root.
- Postorder: elementi i fundit është root.
- Inorder ndan qartë subtree majtas/djathtas.

Preorder + inorder ose postorder + inorder japin tree unik kur keys janë unikë. Vetëm preorder + postorder zakonisht nuk mjaftojnë për binary tree arbitrar; për BST, vetia e rendit ndihmon ta rindërtosh.

## Shembull pune

Për `24,22,94,19,62,39,88,32,40,41,27`:

- 24 root; 22 majtas; 94 djathtas; 19 majtas të 22; 62 majtas të 94; etj.
- Për të fshirë 62 me successor, përdor minimumin e subtree të tij djathtas (88 në strukturën e dhënë).
- `floor(68)=62` para fshirjes; pas fshirjes struktura mund të japë predecessor-in tjetër sipas keys të mbetur. Gjithmonë llogarit mbi tree aktual, jo mbi shembullin e vjetër.

## Gabimet tipike

- Vendos key duke e krahasuar vetëm me prindin e fundit, jo nga root përgjatë rrugës.
- Inorder shkruhet root-left-right.
- Fshin node me dy fëmijë pa hequr successor-in nga pozita e vjetër.
- Nuk update `count`.
- `floor` kthen gjithmonë prindin e fundit pa verifikuar subtree djathtas.

## Kontrolli i njohurive

1. Pse worst case i BST është `O(N)`?
2. Cili traversal jep keys të sortuar?
3. Si fshihet node me dy fëmijë?
4. Dallimi mes successor dhe predecessor?

## Ushtrime

- Ndërto dhe modifiko BST për `8,3,10,1,6,14,4,7`; fshi 3, shto 5, bëj tri traversals.
- Rindërto nga inorder/postorder të PDF-së dhe shkruaj preorder.
- Për disa keys që ekzistojnë dhe mungojnë, gjej `get`, `floor`, `ceiling`.
