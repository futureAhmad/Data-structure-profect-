public class note<T> {
    public static void main(String[] args) {
//        BST<String, Integer> b1 = new BST<String, Integer>();
//		b1.displayinorder();
//		b1.insert("d", 4);
//		b1.insert("b", 2);
//		b1.insert("a", 1);
//		b1.insert("c", 3);
//		b1.insert("e", 5);
//		b1.insert("g", 7);
//		b1.insert("f", 6);
//		b1.displayinorder();
//		b1.remove("a");
//		b1.displayinorder();
//		b1.remove("e");
//		b1.displayinorder();
//		b1.remove("d");
//		b1.displayinorder();
//        System.out.println("_______________");
//        List e=b1.getAll();
//        e.findFirst();
//        while(!e.last()){
//            System.out.print(e.retrieve());
//            e.findNext();
//        }
//        System.out.print(e.retrieve());
//        BST<String, Integer> b1 = new BST<String, Integer>();
//        b1.displayinorder();
//        System.out.println("_____________");
//        Pair<Boolean, Integer> res = b1.insert("d", 4);
//        System.out.println(res);
//        System.out.println("Adding 4 = "+res.first+" ,nb comparision= "+res.second);
//        res = b1.insert("b", 2);
//        System.out.println("--------------------");
//        System.out.println(res);
//        System.out.println("Adding 2 = "+res.first+" ,nb comparision= "+res.second);
//        res = b1.insert("a", 1);
//        System.out.println("--------------------");
//        System.out.println(res);
//        System.out.println("Adding 1 = "+res.first+" ,nb comparision= "+res.second);
//        res = b1.insert("c", 3);
//        System.out.println("--------------------");
//        System.out.println(res);
//        System.out.println("Adding 3 = "+res.first+" ,nb comparision= "+res.second);
//        res = b1.insert("e", 5);
//        System.out.println("--------------------");
//        System.out.println(res);
//        System.out.println("Adding 5 = "+res.first+" ,nb comparision= "+res.second);
//        res = b1.insert("g", 7);
//        System.out.println("--------------------");
//        System.out.println(res);
//        System.out.println("Adding 7 = "+res.first+" ,nb comparision= "+res.second);
//        res = b1.insert("f", 6);
//        System.out.println("--------------------");
//        System.out.println(res);
//        System.out.println("Adding 6 = "+res.first+" ,nb comparision= "+res.second);
//        TreeLocator<String> t1 = new TreeLocator<String>();
//        // t1.displayinorder();
//        Location l1 = new Location(4, 7);
//        int x = t1.add("F", l1);
//        System.out.println("Adding F, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(5, 7);
//        x = t1.add("V", l1);
//        System.out.println("Adding V, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(6, 1);
//        x = t1.add("K", l1);
//        System.out.println("Adding K, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(4, 3);
//        x = t1.add("D", l1);
//        System.out.println("Adding D, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(4, 8);
//        x = t1.add("O", l1);
//        System.out.println("Adding O, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(8, 4);
//        x = t1.add("U", l1);
//        System.out.println("Adding U, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(8, 2);
//        x = t1.add("V", l1);
//        System.out.println("Adding V, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(2, 2);
//        x = t1.add("Y", l1);
//        System.out.println("Adding Y, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(6, 1);
//        x = t1.add("S", l1);
//        System.out.println("Adding S, nb comparision = " + x);
//        System.out.println("-------------------------");
//        l1 = new Location(6, 3);
//        x = t1.add("B", l1);


        // t1.displayinorder();

//        l1 = new Location(4,3);
//        Pair<Boolean, Integer> res = t1.remove("D",l1);
//        System.out.println("Remove D = "+res.first+" , nb comparision = "+res.second);
//        l1 = new Location(4,3);
//        res = t1.remove("A",l1); //Test: incorrect data and the data in location is empty
//        System.out.println("Remove A = "+res.first+" , nb comparision = "+res.second);
//        l1 = new Location(6,1); //Test: incorrect location
//        res = t1.remove("S",l1);
//        System.out.println("Remove U = "+res.first+" , nb comparision = "+res.second);
//        l1 = new Location(2,2);
//        res = t1.remove("Y",l1); //Test: incorrect data
//        System.out.println("Remove Y = "+res.first+" , nb comparision = "+res.second);
//        t1.displayinorder();
        // test method getAll
//        l1 = new Location(4, 7);
//        Pair<Boolean, Integer> res = t1.remove("F", l1);
//        System.out.println("Remove D = " + res.first + " , nb comparision = " + res.second);
//        l1 = new Location(6, 1);
//        res = t1.remove("K", l1);
//        res = t1.remove("S", l1);
//        System.out.println("Remove K = " + res.first + " , nb comparision = " + res.second);
//        l1 = new Location(5, 7);
//        res = t1.remove("V", l1);
//        l1 = new Location(8, 2);
//        res = t1.remove("V", l1);
//        //t1.displayinorder();
//        System.out.println("++++++++++++++++++++");
//
//        List<Pair<Location, List<String>>> l = t1.getAll();
//        l.findFirst();
//        while (!l.last()) {
//            System.out.print(l.retrieve().first); // print the location
//            l.retrieve().second.findFirst();
//            if (!l.retrieve().second.empty())
//                while (!l.retrieve().second.last()) {
//                    System.out.print(l.retrieve().second.retrieve() + ",qwqwq"); // print the data in the list
//                    l.retrieve().second.findNext();
//                }
//            if (!l.retrieve().second.empty())
//                System.out.print(l.retrieve().second.retrieve());
//            System.out.println();
//            l.findNext();
//        }
//        // last Node
//        System.out.print(l.retrieve().first);
//        if (!l.retrieve().second.empty()) {
//            l.retrieve().second.findFirst();
//            while (!l.retrieve().second.last()) {
//                System.out.print(l.retrieve().second.retrieve());
//                l.retrieve().second.findNext();
//            }
//            System.out.print(l.retrieve().second.retrieve());
//
//        }

    }

    /* private List getAll(BSTNode e, LinkedList l) {
        if (e.leftChild == null && e.rightChild == null) {
            Node temp = new Node(e.data);
            temp.next = null;
            if (l.empty())
                l.head = temp;
            l.current = temp;
            return l;
        }
        if (e.leftChild != null) {
            getAll(e.leftChild, l);
            Node temp = new Node(e.data);
            l.current = temp;
            temp.next = null;
            getAll(e.rightChild, l);
        } else {
            Node temp = new Node(e.data);
            temp.next = null;
            if (l.empty())
                l.head = temp;
            l.current = temp;
            getAll(e.rightChild, l);
        }
        return l;
    } */

   /* public int add(T e, Location loc) {
        int nb = 0;
        Location n = new Location(loc.x, loc.y);
        LocatorNode<T> temp = new LocatorNode((List) e, n);
        if (root == null) {
            root = temp;
            return ++nb;
        } else {
            LocatorNode<T> p = root, q = null;
            while (p != null) {
                q = p;
                if (loc.x < p.l.x && loc.y <= p.l.y) p = p.child_1;
                else if (loc.x <= p.l.x && loc.y > p.l.y) p = p.child_2;
                else if (loc.x > p.l.x && loc.y >= p.l.y) p = p.child_3;
                else if (loc.x >= p.l.x && loc.y < p.l.y) p = p.child_4;
                else {
                    ++nb;
                    break; // means it's equal, add it in same node
                }
                ++nb;
            }// end of the while
            if (loc.x == p.l.x && loc.y == p.l.y) {
                LinkedList list = new LinkedList();
                list.insert(temp);

            } else {
                if (loc.x < q.l.x && loc.y <= q.l.y) q.child_1 = temp;
                else if (loc.x <= q.l.x && loc.y > q.l.y) q.child_2 = temp;
                else if (loc.x > q.l.x && loc.y >= q.l.y) q.child_3 = temp;
                else
                    q.child_4 = temp;
            }
        }
        return nb;
    }
    */

   /* public int add(T e, Location loc) {
        int nb = 0;
        //Location n= new Location(loc.x,loc.y);
        if (root != null) {
            LocatorNode<T> p = root, q = null;
            while (p != null) {
                q = p;
                if (loc.x < p.l.x && loc.y <= p.l.y) p = p.child_1;
                else if (loc.x <= p.l.x && loc.y > p.l.y) p = p.child_2;
                else if (loc.x > p.l.x && loc.y >= p.l.y) p = p.child_3;
                else if (loc.x >= p.l.x && loc.y < p.l.y) p = p.child_4;
                else {
                    ++nb;
                    break; // means it's equal, add it in same node
                }
                ++nb;
            }// end of the while
        }
        if (loc.x == p.l.x && loc.y == p.l.y) {
            p.data.insert(e);
            return nb;
        }

        List<T> list = new LinkedList<>();
        list.insert(e);
        LocatorNode<T> temp = new LocatorNode(list, loc);
        if (root == null) {
            root = current = temp;
            return nb;
        } else {
            if (loc.x < q.l.x && loc.y <= q.l.y) q.child_1 = temp;
            else if (loc.x <= q.l.x && loc.y > q.l.y) q.child_2 = temp;
            else if (loc.x > q.l.x && loc.y >= q.l.y) q.child_3 = temp;
            else
                q.child_4 = temp;
        }
        current = temp;
        return nb;
    }
}

*/
    /* add
    int nb=0;
        List<T> list=new LinkedList<>();
        list.insert(e);
        LocatorNode<T> temp=new LocatorNode(list,loc);

        if(root==null) {
            root = current = temp;
            return nb;
        }else{
            LocatorNode<T> p=root,q=null;
            while(p!=null){
                q=p;
                if(loc.x<p.l.x && loc.y<=p.l.y)  p=p.child_1;
                else if(loc.x<=p.l.x && loc.y>p.l.y)  p=p.child_2;
                else if(loc.x>p.l.x && loc.y>=p.l.y)  p=p.child_3;
                else if(loc.x>=p.l.x && loc.y<p.l.y)  p=p.child_4;
                else {
                    ++nb;
                    break; // means it's equal, add it in same node
                }
                ++nb;
            }// end of the while
            if(loc.x==p.l.x && loc.y==p.l.y){
                p.data.insert(e);
            }else {
                if (loc.x < q.l.x && loc.y <= q.l.y) q.child_1 = temp;
                else if (loc.x <= q.l.x && loc.y > q.l.y) q.child_2 = temp;
                else if (loc.x > q.l.x && loc.y >= q.l.y) q.child_3 = temp;
                else
                    q.child_4 = temp;
            }
            current=temp;
        }
        return nb;*/
    /*public List<Pair<Location, List<T>>> getAll() {
        List<Pair<Location, List<T>>> listAll= new LinkedList<>();
        return getAll(root,listAll,0);
    }
    private List<Pair<Location, List<T>>> getAll(LocatorNode e,List list,int nb){
        if(e==null)
            return null;
        getAll(e.child_1,list,0);
        while(!e.data.last()){
            if(nb==0) {
                e.data.findFirst();
                ++nb;
            }
            list.insert(e);
            e.data.findNext();
        }
        list.insert(e); // inserting the last element
        getAll(e.child_2,list,0);
        while(!e.data.last()){
            if(nb==0) {
                e.data.findFirst();
                ++nb;
            }
            list.insert(e);
            e.data.findNext();
        }
        list.insert(e);
        getAll(e.child_3,list,0);
        while(!e.data.last()){
            if(nb==0) {
                e.data.findFirst();
                ++nb;
            }
            list.insert(e);
            e.data.findNext();
        }
        list.insert(e);
        getAll(e.child_4,list,0);
        while(!e.data.last()){
            if(nb==0) {
                e.data.findFirst();
                ++nb;
            }
            list.insert(e);
            e.data.findNext();
        }
        list.insert(e);
        return list;

    }*/
/*
    public Pair<List<Pair<Location, List<T>>>, Integer> inRange(Location lowerLeft, Location upperRight) {
        List<Pair<Location, List<T>>> RangeList = new LinkedList<>();
        int counter = 0;

        recCounter = 0;
        recInRange(list, lowerLeft, upperRight, root);
        return new Pair<>(list, recCounter);


        if (root == null)
            return new Pair<>(RangeList, counter);

        Stack<Integer, LocatorNode<T>> stack = new Stack<>();
        LocatorNode<T> q = root;

        while (q != null) {
            counter++;

            if (!q.data.empty() && q.l.x >= lowerLeft.x && q.l.x <= upperRight.x
                    && q.l.y >= lowerLeft.y && q.l.y <= upperRight.y)
                RangeList.insert(new Pair<>(q.l, q.data));

            if (q.child_4 != null && q.l.x <= upperRight.x && q.l.y > lowerLeft.y)
                stack.push(q.child_4);
            if (q.child_3 != null && q.l.x < upperRight.x && q.l.y <= upperRight.y)
                stack.push(q.child_3);
            if (q.child_2 != null && q.l.x >= lowerLeft.x && q.l.y < upperRight.y)
                stack.push(q.child_2);
            if (q.child_1 != null && q.l.x > lowerLeft.x && q.l.y >= lowerLeft.y)
                stack.push(q.child_1);

            q = stack.pop();
        }
        return new Pair<>(RangeList, counter);
    }
} */
    /*public void displayinorder() {
        if (root == null)
            System.out.println("Empty BST");
        else {
            displaykeyinorder(root);
            System.out.println();

        }
    }
    private void displaykeyinorder(LocatorNode<T> p) {
        if(p == null)
            return;

        else {
                    displaykeyinorder(p.child_1);
                    System.out.print(p.l + " ");
                    p.data.findFirst();
                    if(!p.data.empty()) {
                        while (!p.data.last()) {
                            if (p.data.empty()) {
                                break;
                            } else {
                                System.out.print(p.data.retrieve() + ",  ");
                                p.data.findNext();
                            }
                        }
                            System.out.print(p.data.retrieve() + ",  ");
                        }
                    }
                    displaykeyinorder(p.child_2);
                    displaykeyinorder(p.child_3);
                    displaykeyinorder(p.child_4);

        }*/
}


