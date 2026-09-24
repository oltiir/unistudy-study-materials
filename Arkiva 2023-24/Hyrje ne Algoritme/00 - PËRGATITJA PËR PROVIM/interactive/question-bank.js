"use strict";

window.EXTRA_CHALLENGES = {
  flowcharts: [
    { id:"f3", level:"Lehtë", title:"Hapi i numrave çift", prompt:"Me sa duhet të rritet i kur kalojmë vetëm nëpër numra çift?", answers:["2","i+=2","i=i+2"], hint:"2,4,6,8...", solution:"i rritet me 2: i = i + 2." },
    { id:"f4", level:"Lehtë", title:"Faktorieli", prompt:"Me çfarë vlere inicializohet f për llogaritjen e n!?", answers:["1","f=1"], hint:"Përdor vlerën neutrale të shumëzimit.", solution:"f = 1." },
    { id:"f5", level:"Mesatare", title:"Kufiri i ciklit", prompt:"Për ta përfshirë n, cili kusht përdoret: i<n apo i<=n?", answers:["i<=n","i≤n"], hint:"Barazia e përfshin kufirin.", solution:"i <= n." },
    { id:"f6", level:"Mesatare", title:"Trace i shumës", prompt:"Sa del shuma e katrorëve nga 4 deri në 6?", answers:["77"], hint:"4²+5²+6².", solution:"16+25+36=77." },
    { id:"f7", level:"Provimi", title:"Prodhimi me kufi", prompt:"Për n=5, sa është prodhimi i k nga 7 deri në n+3?", answers:["56"], hint:"n+3=8.", solution:"7·8=56." },
    { id:"f8", level:"Provimi", title:"Output-i final", prompt:"Nëse kërkohet vetëm shuma finale, output-i vendoset brenda apo jashtë ciklit?", answers:["jashte","jashtë","jashte ciklit","jashtë ciklit"], hint:"Nuk duam ta shfaqim çdo shumë parciale.", solution:"Jashtë ciklit." }
  ],
  complexity: [
    { id:"c3", level:"Lehtë", title:"Cikle të njëpasnjëshme", prompt:"O(n) + O(n log n) simplifikohet në?", answers:["o(nlogn)","theta(nlogn)","nlogn"], hint:"Mbaje termin dominues.", solution:"O(n log n)." },
    { id:"c4", level:"Mesatare", title:"Shuma trekëndore", prompt:"1+2+...+n ka cilin rend rritjeje?", answers:["theta(n^2)","o(n^2)","n^2","n2"], hint:"Formula është n(n+1)/2.", solution:"Θ(n²)." },
    { id:"c5", level:"Mesatare", title:"Përgjysmimi", prompt:"while (n>1) n/=2 ka kompleksitet?", answers:["theta(logn)","o(logn)","logn"], hint:"Inputi përgjysmohet çdo herë.", solution:"Θ(log n)." },
    { id:"c6", level:"Provimi", title:"3-SUM brutal", prompt:"Tre cikle për çdo treshe elementesh kanë kompleksitet?", answers:["theta(n^3)","o(n^3)","n^3","n3"], hint:"n·n·n.", solution:"Θ(n³)." },
    { id:"c7", level:"Lehtë", title:"Binary search", prompt:"Çfarë kushti duhet të plotësojë array para binary search?", answers:["i sortuar","sortuar","te jete i sortuar","të jetë i sortuar"], hint:"Ndryshe nuk mund ta eliminojmë gjysmën.", solution:"Array duhet të jetë i sortuar." },
    { id:"c8", level:"Provimi", title:"Memoria e arrays", prompt:"Vetëm elementet e dy int[N] arrays zënë sa bytes gjithsej?", answers:["8n","8*n","8 n","8n bytes"], hint:"Një int ka 4 bytes.", solution:"2·N·4 = 8N bytes, pa overhead." }
  ],
  stacks: [
    { id:"s3", level:"Lehtë", title:"LIFO", prompt:"push(A), push(B), push(C), pop(). Cili element del?", answers:["c"], hint:"I fundit brenda, i pari jashtë.", solution:"Del C." },
    { id:"s4", level:"Lehtë", title:"FIFO", prompt:"enq(A), enq(B), deq(), enq(C). Cila është queue finale?", answers:["b,c","bc","[b,c]"], hint:"A del i pari.", solution:"[B,C]." },
    { id:"s5", level:"Mesatare", title:"Infix në postfix", prompt:"Kthe A+B*C në postfix.", answers:["abc*+","a b c * +"], hint:"Shumëzimi ekzekutohet para mbledhjes.", solution:"A B C * +." },
    { id:"s6", level:"Mesatare", title:"Rendi i operandëve", prompt:"Vlerëso postfix: 8 2 / 3 -", answers:["1"], hint:"left/right për / dhe - nuk ndërrohen.", solution:"8/2=4; 4-3=1." },
    { id:"s7", level:"Provimi", title:"Resize poshtë", prompt:"Kur përgjysmohet resizing array sipas materialit: N=capacity/?", answers:["4","capacity/4","n=capacity/4"], hint:"Jo kur është gjysmë plot.", solution:"Kur N = capacity/4." },
    { id:"s8", level:"Provimi", title:"Dijkstra two-stack", prompt:"Vlerëso ((2+3)*(4-1)).", answers:["15"], hint:"Zgjidhi kllapat e brendshme.", solution:"(2+3)=5, (4-1)=3, 5·3=15." }
  ],
  "elementary-sorts": [
    { id:"e3", level:"Lehtë", title:"Selection comparisons", prompt:"Sa krahasime bën selection sort për N=5?", answers:["10"], hint:"N(N-1)/2.", solution:"5·4/2=10." },
    { id:"e4", level:"Lehtë", title:"Insertion best case", prompt:"Kompleksiteti best-case i insertion sort?", answers:["o(n)","theta(n)","n"], hint:"Array është tashmë i sortuar.", solution:"Θ(n)." },
    { id:"e5", level:"Mesatare", title:"Stabiliteti", prompt:"Cili nga Selection, Insertion, Shell është stable?", answers:["insertion","insertion sort"], hint:"Nuk i ndërron elementet e barabarta.", solution:"Insertion sort." },
    { id:"e6", level:"Mesatare", title:"Gap sequence", prompt:"Për N=10 me 3x+1, cili është gap-i i parë?", answers:["4","h=4"], hint:"1,4,13...; merre më të madhin nën N/3 sipas kodit.", solution:"h=4, pastaj h=1." },
    { id:"e7", level:"Provimi", title:"Selection: iterimi i parë", prompt:"Pas iterimit të parë të selection në [4,1,3,2], si duket array?", answers:["1,4,3,2","1432"], hint:"Minimumi 1 ndërrohet me 4.", solution:"[1,4,3,2]." },
    { id:"e8", level:"Provimi", title:"Shell h-sorted", prompt:"Pas fazës finale, cili gap garanton sortim të plotë?", answers:["1","h=1"], hint:"Faza e fundit është insertion sort klasik.", solution:"h=1." }
  ],
  mergesort: [
    { id:"m3", level:"Mesatare", title:"Merge i plotë", prompt:"Bashko [2,5,8] dhe [1,3,9].", answers:["1,2,3,5,8,9","123589"], hint:"Merre më të voglin nga dy pointerët.", solution:"[1,2,3,5,8,9]." },
    { id:"m4", level:"Lehtë", title:"Hapësira", prompt:"Sa hapësirë shtesë kërkon mergesort standard për aux?", answers:["o(n)","theta(n)","n"], hint:"Aux ka madhësi N.", solution:"Θ(N)." },
    { id:"m5", level:"Mesatare", title:"Bottom-up sizes", prompt:"Shkruaj katër madhësitë e para të blloqeve bottom-up.", answers:["1,2,4,8","1248"], hint:"Dyfishohen.", solution:"1,2,4,8." },
    { id:"m6", level:"Provimi", title:"Stabiliteti në barazi", prompt:"Kur dy keys janë të barabarta, nga cila gjysmë merret elementi që merge të mbetet stable?", answers:["majtas","e majta","gjysma e majte","gjysma e majtë"], hint:"Ruaje elementin që ishte më herët në input.", solution:"Nga gjysma e majtë." },
    { id:"m7", level:"Provimi", title:"Nivelet", prompt:"Për N=16, sa nivele ndarjeje ka pema e mergesort?", answers:["4","log2(16)","log216"], hint:"16→8→4→2→1.", solution:"log₂16=4 nivele." },
    { id:"m8", level:"Teori", title:"Lower bound", prompt:"Lower bound për sorting me krahasime është?", answers:["omega(nlogn)","nlogn","ω(nlogn)"], hint:"Decision tree ka N! gjethe.", solution:"Ω(N log N)." }
  ],
  quicksort: [
    { id:"q3", level:"Mesatare", title:"Worst case", prompt:"Kompleksiteti kur pivoti del vazhdimisht skajor?", answers:["o(n^2)","theta(n^2)","n^2","n2"], hint:"Ndarjet janë 0 dhe N-1.", solution:"Θ(N²)." },
    { id:"q4", level:"Provimi", title:"3-way: > pivot", prompt:"Pas swap me gt në rastin a[i]>pivot, a rritet i?", answers:["jo","no","nuk rritet","i nuk rritet"], hint:"Elementi i ardhur nga gt ende s'është kontrolluar.", solution:"Jo; vetëm gt zvogëlohet." },
    { id:"q5", level:"Lehtë", title:"Stabiliteti", prompt:"A është quicksort standard stable?", answers:["jo","no"], hint:"Swaps mund ta ndryshojnë rendin relativ.", solution:"Jo." },
    { id:"q6", level:"Mesatare", title:"Rekursioni 3-way", prompt:"A futet zona =pivot përsëri në rekursion?", answers:["jo","no"], hint:"Ajo zonë është finale.", solution:"Jo; sortohen vetëm zonat < dhe >." },
    { id:"q7", level:"Provimi", title:"Partition klasik", prompt:"Te [5,3,1,7,4,2,6], në cilin indeks 0-based vendoset pivot 5?", answers:["4"], hint:"Pas partition: [4,3,1,2,5,7,6].", solution:"Indeksi 4." },
    { id:"q8", level:"Teori", title:"Average case", prompt:"Rendi mesatar i quicksort pas shuffle?", answers:["o(nlogn)","theta(nlogn)","nlogn"], hint:"Ndarjet priten të jenë mjaft të balancuara.", solution:"Θ(N log N)." }
  ],
  heap: [
    { id:"h3", level:"Lehtë", title:"Indeksi i prindit", prompt:"Në heap 1-based, cili është prindi i indeksit 7?", answers:["3"], hint:"floor(k/2).", solution:"floor(7/2)=3." },
    { id:"h4", level:"Lehtë", title:"Fëmijët", prompt:"Në heap 1-based, cilët janë fëmijët e indeksit 3?", answers:["6,7","67"], hint:"2k dhe 2k+1.", solution:"6 dhe 7." },
    { id:"h5", level:"Lehtë", title:"max()", prompt:"Kompleksiteti i max() në max-heap?", answers:["o(1)","theta(1)","1","konstante"], hint:"Maksimumi është root.", solution:"O(1)." },
    { id:"h6", level:"Provimi", title:"Heap construction", prompt:"Kompleksiteti i bottom-up heap construction?", answers:["o(n)","theta(n)","n"], hint:"Nuk është kufi i ngushtë N log N.", solution:"Θ(N)." },
    { id:"h7", level:"Mesatare", title:"Sink", prompt:"Gjatë sink në max-heap, zgjidhet fëmija më i madh apo më i vogël?", answers:["me i madh","më i madh","i madh","femija me i madh","fëmija më i madh"], hint:"Prindi duhet të jetë ≥ të dy fëmijët.", solution:"Fëmija më i madh." },
    { id:"h8", level:"Provimi", title:"Validimi i heap-it", prompt:"A është [9,7,8,10] max-heap?", answers:["jo","no"], hint:"10 është fëmijë i 7.", solution:"Jo; 7<10 e shkel heap-order." }
  ],
  "symbol-tables": [
    { id:"t3", level:"Lehtë", title:"rank(P)", prompt:"Në [A,C,E,H,L,M,P,R,S,X], sa është rank(P)?", answers:["6"], hint:"P ka gjashtë keys më të vegjël.", solution:"rank(P)=6." },
    { id:"t4", level:"Mesatare", title:"floor(Q)", prompt:"Në të njëjtën listë, floor(Q)=?", answers:["p"], hint:"Key më i madh ≤Q.", solution:"P." },
    { id:"t5", level:"Mesatare", title:"ceiling(Q)", prompt:"Në të njëjtën listë, ceiling(Q)=?", answers:["r"], hint:"Key më i vogël ≥Q.", solution:"R." },
    { id:"t6", level:"Provimi", title:"Ordered array insert", prompt:"Kompleksiteti worst-case i insert në ordered array?", answers:["o(n)","theta(n)","n"], hint:"Gjetja është log n, por elementet zhvendosen.", solution:"Θ(N)." },
    { id:"t7", level:"Lehtë", title:"Sequential search", prompt:"Kompleksiteti worst-case i search në linked-list symbol table?", answers:["o(n)","theta(n)","n"], hint:"Mund ta skanojë tërë listën.", solution:"Θ(N)." },
    { id:"t8", level:"Provimi", title:"select", prompt:"Në listën e dhënë, select(6)=?", answers:["p"], hint:"Select është e kundërta e rank.", solution:"P." }
  ],
  bst: [
    { id:"b3", level:"Lehtë", title:"Traversal i sortuar", prompt:"Cili traversal i BST jep keys në rend rritës?", answers:["inorder","lvr","left root right"], hint:"Left, Root, Right.", solution:"Inorder (LVR)." },
    { id:"b4", level:"Mesatare", title:"Worst height", prompt:"Sa është lartësia worst-case e BST me N nodes?", answers:["n-1","n - 1","o(n)","theta(n)"], hint:"Keys e sortuar mund ta bëjnë listë.", solution:"N-1 edges, pra Θ(N)." },
    { id:"b5", level:"Provimi", title:"Hibbard delete", prompt:"Me çfarë zëvendësohet node me dy fëmijë në variantin standard?", answers:["successor","pasardhesi","pasardhësi","minimumi i subtree djathtas","min i djathte"], hint:"Merre minimumin nga ana e djathtë.", solution:"Me successor-in: minimumin e subtree djathtas." },
    { id:"b6", level:"Lehtë", title:"Root nga preorder", prompt:"Cili element i preorder është root?", answers:["i pari","elementi i pare","elementi i parë","first"], hint:"Preorder nis me Root.", solution:"Elementi i parë." },
    { id:"b7", level:"Provimi", title:"Postorder", prompt:"BST nga 8,3,10,1,6. Shkruaje postorder.", answers:["1,6,3,10,8","163108"], hint:"Left, Right, Root.", solution:"1,6,3,10,8." },
    { id:"b8", level:"Mesatare", title:"deleteMin", prompt:"Kur node minimal s'ka left, cili link kthehet nga deleteMin?", answers:["right","x.right","djathtas","linku djathtas"], hint:"Duhet të ruhet subtree i mundshëm djathtas.", solution:"Kthehet x.right." },
    { id:"b9", level:"Provimi", title:"Rank me count", prompt:"Çfarë fushe ruan çdo node për rank/select efikas?", answers:["count","size","madhesia e subtree","madhësia e subtree"], hint:"Numri i nodes në subtree.", solution:"count/size i subtree." },
    { id:"b10", level:"Provimi", title:"Tree unik", prompt:"Cilat dy traversals mjaftojnë për tree unik me keys unikë: preorder + ?", answers:["inorder","lvr"], hint:"Duhet traversal që ndan majtas/djathtas.", solution:"Preorder + inorder." }
  ],
  balanced: [
    { id:"r3", level:"Lehtë", title:"Linku i kuq", prompt:"Në LLRB, në cilën anë duhet të anojë linku i kuq?", answers:["majtas","left","ne te majte","në të majtë"], hint:"Left-leaning.", solution:"Majtas." },
    { id:"r4", level:"Mesatare", title:"Red-right", prompt:"Cili operacion korrigjon right link të kuq kur left nuk është i kuq?", answers:["rotateleft","rotateleft(h)","rotate left"], hint:"Rrotullim kah e majta.", solution:"rotateLeft." },
    { id:"r5", level:"Mesatare", title:"Dy të kuqe majtas", prompt:"Cili operacion përdoret për red-left-left?", answers:["rotateright","rotateright(h)","rotate right"], hint:"Rrotullim kah e djathta.", solution:"rotateRight." },
    { id:"r6", level:"Provimi", title:"Dy fëmijë të kuq", prompt:"Cili operacion bëhet kur të dy fëmijët janë të kuq?", answers:["flipcolors","flip colors","color flip"], hint:"Përfaqëson split të 4-node.", solution:"flipColors." },
    { id:"r7", level:"Teori", title:"Lartësia", prompt:"Upper bound i lartësisë së red-black BST është afërsisht?", answers:["2logn","2log2n","2 log n","2*logn"], hint:"Rruga më e gjatë s'është mbi dyfishin e black-height.", solution:"≤2 log₂N." },
    { id:"r8", level:"Lehtë", title:"Perfect balance", prompt:"Në 2-3 tree, ku duhet të jenë të gjitha gjethet?", answers:["ne te njejtin nivel","në të njëjtin nivel","nivel te njejte","same level"], hint:"Kjo është perfect balance.", solution:"Në të njëjtin nivel." }
  ],
  hash: [
    { id:"x3", level:"Mesatare", title:"Horner CAT", prompt:"Për CAT, bazë 31 dhe M=13, cili është indeksi?", answers:["4"], hint:"(((67)·31+65)·31+84) mod 13.", solution:"Indeksi 4." },
    { id:"x4", level:"Lehtë", title:"Chaining bucket", prompt:"M=5, f(x)=2x+5. Në cilin bucket shkon 14?", answers:["3"], hint:"33 mod 5.", solution:"f(14)=33; 33 mod 5=3." },
    { id:"x5", level:"Provimi", title:"Quadratic probing", prompt:"M=11, f=3x-2; 4 është në 10 dhe 8 në 0. Ku vendoset key 15?", answers:["1"], hint:"h0=10 collision; provo i=1 në f+i+i².", solution:"(43+1+1) mod 11=1." },
    { id:"x6", level:"Provimi", title:"Double hashing", prompt:"M=13, f=2x+1; 3 është në 7, 9 në 6. Ku vendoset 16?", answers:["0"], hint:"h1=7, h2=6; provo i=1.", solution:"(7+6) mod 13=0." },
    { id:"x7", level:"Mesatare", title:"Cuckoo lookup", prompt:"Sa pozita kandidate kontrollon lookup në cuckoo hashing me dy hash functions?", answers:["2","dy"], hint:"Një për secilin hash function.", solution:"Dy pozita." },
    { id:"x8", level:"Provimi", title:"Rolling hash", prompt:"Baza 10, M=101: hash(234)=?", answers:["32"], hint:"234 mod 101.", solution:"234 mod 101=32." },
    { id:"x9", level:"Provimi", title:"Deletion në probing", prompt:"A mund ta zëvendësosh key e fshirë direkt me null në linear probing?", answers:["jo","no"], hint:"Mund ta këpusë rrugën e search.", solution:"Jo; përdor tombstone ose rehash cluster-in." },
    { id:"x10", level:"Mesatare", title:"Resize", prompt:"Pas ndryshimit të M, a duhet rehash për çdo key?", answers:["po","yes"], hint:"hash mod M ndryshon.", solution:"Po." },
    { id:"x11", level:"Teori", title:"Kontrata equals/hashCode", prompt:"Nëse x.equals(y), a duhet hashCode të jetë i njëjtë?", answers:["po","yes"], hint:"Kjo është kërkesë e kontratës.", solution:"Po, patjetër." },
    { id:"x12", level:"Teori", title:"Worst case", prompt:"Worst-case i search në hash table me collisions të këqija?", answers:["o(n)","theta(n)","n"], hint:"Të gjitha keys mund të bien bashkë.", solution:"O(N)." }
  ],
  applications: [
    { id:"a3", level:"Lehtë", title:"Set", prompt:"A ruan Set duplikate?", answers:["jo","no"], hint:"Keys janë unikë.", solution:"Jo." },
    { id:"a4", level:"Mesatare", title:"Një key, shumë values", prompt:"Cila strukturë përdoret kur një key ka shumë values?", answers:["st<key,set<value>>","st key set value","map key set value","stkeysetvalue"], hint:"Value vetë bëhet Set.", solution:"ST<Key, SET<Value>>." },
    { id:"a5", level:"Mesatare", title:"Concordance", prompt:"Çfarë ruan value te concordance?", answers:["pozitat","indekset","set i pozitave","lista e pozitave"], hint:"Duhet të gjejë kontekstin rreth çdo paraqitjeje.", solution:"Pozitat/indekset e fjalës në tekst." },
    { id:"a6", level:"Provimi", title:"Sparse complexity", prompt:"Kompleksiteti i dot product kur iterohen vetëm elementet jo-zero?", answers:["o(nnz)","theta(nnz)","nnz"], hint:"nnz është numri i vlerave jo-zero.", solution:"Θ(nnz)." },
    { id:"a7", level:"Lehtë", title:"WhiteList", prompt:"WhiteList printon keys që gjenden apo që mungojnë në set?", answers:["qe gjenden","që gjenden","gjenden","found"], hint:"BlackList bën të kundërtën.", solution:"Keys që gjenden." },
    { id:"a8", level:"Provimi", title:"Sparse matrix", prompt:"Si përfaqësohet sparse matrix sipas materialit?", answers:["array i sparse vectors","array me sparse vectors","rreshta sparse","array of sparse vectors"], hint:"Një sparse vector për çdo rresht.", solution:"Si array i sparse vectors, një për çdo rresht." }
  ]
};

// Pyetje shtesë të modeluara drejtpërdrejt nga testet reale të dërguara.
// Prefiksi "real-" i dallon nga ushtrimet bazë dhe e ruan progresin stabil.
const REAL_EXAM_CHALLENGES = {
  flowcharts: [
    { id:"real-f1", level:"Test real", title:"Funksion pjesë-pjesë", prompt:"Nëse y=2x për x<2, sa është y për x=1.8?", answers:["3.6","3,6"], hint:"1.8 është më e vogël se 2.", solution:"Përdoret dega y=2x: y=2·1.8=3.6." },
    { id:"real-f2", level:"Test real", title:"Kufijtë e intervaleve", prompt:"Norma është 2% për 1000<=shuma<5000 dhe 4% për 5000<=shuma<=10000. Cila normë vlen për 5000?", answers:["4%","4","0.04"], hint:"Shiko cili interval e përfshin barazinë te 5000.", solution:"5000 hyn në intervalin e dytë, prandaj norma është 4%." }
  ],
  complexity: [
    { id:"real-c1", level:"Test real", title:"Dy cikle n × n", prompt:"Sa herë ekzekutohet trupi i dy cikleve të futura, secili nga 0 deri n-1?", answers:["n^2","n*n","n2"], hint:"Për secilin nga n iterimet e jashtme ka n iterime të brendshme.", solution:"n·n=n² herë; kompleksiteti Θ(n²)." },
    { id:"real-c2", level:"Test real", title:"Cikli trekëndor", prompt:"for(i=0;i<n;i++) for(j=i;j<n;j++) work(); ka cilin kompleksitet?", answers:["theta(n^2)","o(n^2)","n^2","n2"], hint:"Numri i punëve është n+(n-1)+...+1.", solution:"n(n+1)/2, pra Θ(n²)." }
  ],
  stacks: [
    { id:"real-s1", level:"Test real", title:"Postfix i provimit", prompt:"Kthe (A-B)+C*(G+H)+D në postfix.", answers:["ab-cgh+*+d+","a b - c g h + * + d +"], hint:"Kthe veçmas (A-B) dhe (G+H), pastaj shumëzimin.", solution:"A B - C G H + * + D +." },
    { id:"real-s2", level:"Test real", title:"Pohim për stack", prompt:"Saktë apo pasaktë: stack lejon qasje te elementi i parë i insertuar.", answers:["pasakte","pasaktë","jo"], hint:"Stack është LIFO.", solution:"Pasaktë; qasja është te elementi i fundit i futur." }
  ],
  "elementary-sorts": [
    { id:"real-e1", level:"Test real", title:"Array pothuajse i sortuar", prompt:"Cili sortim preferohet zakonisht kur array është pothuajse i sortuar?", answers:["insertion","insertion sort"], hint:"Ky algoritëm ka best-case linear dhe pak zhvendosje kur inversionet janë të pakta.", solution:"Insertion sort." },
    { id:"real-e2", level:"Test real", title:"Selection worst-case", prompt:"Saktë apo pasaktë: selection sort ka Θ(n²) krahasime edhe në worst-case.", answers:["sakte","saktë","po"], hint:"Numri i krahasimeve pothuajse nuk varet nga rendi i inputit.", solution:"Saktë: n(n-1)/2 krahasime." }
  ],
  mergesort: [
    { id:"real-m1", level:"Test real", title:"Merge dhe in-place", prompt:"Saktë apo pasaktë: mergesort standard me auxiliary array është in-place.", answers:["pasakte","pasaktë","jo"], hint:"Aux ka madhësi proporcionale me inputin.", solution:"Pasaktë; kërkon Θ(n) hapësirë ndihmëse." }
  ],
  quicksort: [
    { id:"real-q1", level:"Test real", title:"QuickSort me duplikate", prompt:"Sa keys të barabarta ka vargu F1,F6,F1,F6,F3,F5,F3,F5?", answers:["4 cifte","4 çifte","4"], hint:"Keys unikë janë F1,F3,F5,F6.", solution:"Ka katër vlera të ndryshme dhe secila paraqitet dy herë; 3-way quicksort i grupon mirë duplikatet." }
  ],
  heap: [
    { id:"real-h1", level:"Test real", title:"Heap nga testi", prompt:"Bottom-up max-heap nga [15,27,24,9,8,72,49,82,19,6] ka cilin root?", answers:["82"], hint:"Root i max-heap është maksimumi.", solution:"Root është 82; një heap final valid nga bottom-up është [82,27,72,19,8,24,49,9,15,6]." },
    { id:"real-h2", level:"Test real", title:"Pas delMax", prompt:"Nga heap [82,27,72,19,8,24,49,9,15,6], cili është root pas delMax dhe sink?", answers:["72"], hint:"Pas heqjes së 82, maksimumi i mbetur duhet të dalë në root.", solution:"Root bëhet 72; heap-i është [72,27,49,19,8,24,6,9,15]." }
  ],
  "symbol-tables": [
    { id:"real-t1", level:"Test real", title:"API e Symbol Table", prompt:"Cilat janë tri key operations të Symbol Table? Shkruaji me presje.", answers:["put,get,delete","put get delete"], hint:"Fut/përditëso, kërko dhe fshi.", solution:"put, get, delete." },
    { id:"real-t2", level:"Test real", title:"contains(key)", prompt:"Saktë apo pasaktë: contains(key) kontrollon ekzistencën e key në tabelë.", answers:["sakte","saktë","po"], hint:"Nuk po kërkon një value arbitrare.", solution:"Saktë." }
  ],
  bst: [
    { id:"real-b1", level:"Test real", title:"Inorder nga testi", prompt:"BST nga 11,6,19,4,8,17,43,5,10,31,49: shkruaj inorder.", answers:["4,5,6,8,10,11,17,19,31,43,49","456810111719314349"], hint:"Inorder në BST është rend rritës.", solution:"4,5,6,8,10,11,17,19,31,43,49." },
    { id:"real-b2", level:"Test real", title:"Successor për delete", prompt:"Në të njëjtën BST, me cilin key zëvendësohet 19 gjatë Hibbard delete?", answers:["31"], hint:"Minimumi i subtree djathtas të 19.", solution:"Me 31." }
  ],
  balanced: [
    { id:"real-r1", level:"Test real", title:"Perfect balance", prompt:"Saktë apo pasaktë: në 2-3 tree të gjitha rrugët nga root te null link kanë gjatësi të njëjtë.", answers:["sakte","saktë","po"], hint:"Kjo është arsyeja pse quhet perfectly balanced.", solution:"Saktë." }
  ],
  hash: [
    { id:"real-x1", level:"Test real", title:"Chaining nga testi", prompt:"Për h(x)=(2x+1) mod 5 dhe keys 3,5,7,10,11,12,2,13, cilat keys bien në bucket 0?", answers:["7,12,2","7122"], hint:"Llogarit hash-in për secilin key.", solution:"7, 12 dhe 2." },
    { id:"real-x2", level:"Test real", title:"Primary clustering", prompt:"Cila metodë shkakton zakonisht primary clustering?", answers:["linear probing","linear","probing linear"], hint:"Kontrollon slotet një nga një.", solution:"Linear probing." }
  ]
};

Object.entries(REAL_EXAM_CHALLENGES).forEach(([topic, challenges]) => {
  window.EXTRA_CHALLENGES[topic].push(...challenges);
});
