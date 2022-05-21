
public class TreeLocator<T> implements Locator<T> {
    LocatorNode<T> root,current;

    @Override
    public int add(T e, Location loc) {
        int nb = 0;
        LocatorNode<T> p = root, q = null;
        if (root != null) {
            while (p != null) {
                q = p;
                if (loc.x < p.l.x && loc.y <= p.l.y) p = p.child_1;
                else if (loc.x <= p.l.x && loc.y > p.l.y) p = p.child_2;
                else if (loc.x > p.l.x && loc.y >= p.l.y) p = p.child_3;
                else if (loc.x >= p.l.x && loc.y < p.l.y) p = p.child_4;
                else {
                    if (loc.x == p.l.x && loc.y == p.l.y) { // means it's equal, add it in same node
                        ++nb;
                        p.data.insert(e);
                        current =p;
                        return nb;
                    }
                }
                ++nb;
            }// end of the while
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
        current = temp; // the current in the new node
        return nb;
    }

    @Override
    public Pair<List<T>, Integer> get(Location loc) {
        LocatorNode<T> p=root,q=null;
        int nb=0;
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

        if(loc.x==q.l.x && loc.y==q.l.y) // find the location
            return new Pair<>(q.data, nb);
        else {
            List<T> empty= new LinkedList<>();
            return new Pair<>(empty, nb); // we should use try and catch in main , read below
        }
       /* assume that we are declare,
        TreeLocator<String> t1 = new TreeLocator<>();
        Location l1 = new Location(88,2); , assume that this location is not represented
        Pair<List<String>, Integer> look = t1.get(l1);
        try {
            System.out.println("Data is " + look.first.retrieve() + " , number of comparision = " + look.second);
        }catch (NullPointerException e){
            System.out.println("Data is null" + " , number of comparision = " + look.second); */
        }
    @Override
    public Pair<Boolean, Integer> remove(T e, Location loc) {
        LocatorNode<T> p=root,q=null;
        int nb=0;
        while(p!=null){
            q=p;
            if(loc.x<p.l.x && loc.y<=p.l.y)  p=p.child_1;
            else if(loc.x<=p.l.x && loc.y>p.l.y)  p=p.child_2;
            else if(loc.x>p.l.x && loc.y>=p.l.y)  p=p.child_3;
            else if(loc.x>=p.l.x && loc.y<p.l.y)  p=p.child_4;
            else {
                ++nb;
                break; // means it's equal
            }
            ++nb;
        }// end of the while
        if(loc.x==q.l.x && loc.y==q.l.y && !q.data.empty()) {
            q.data.findFirst();
            int done=0;
            while (!q.data.last()) {
                if (q.data.retrieve().equals(e)) {
                    q.data.remove();
                    done++;
                    continue; // because the remove automatically will change the current
                }
                q.data.findNext();
            } // end while
                if (q.data.retrieve().equals(e)) { // check the last element
                    q.data.remove();
                    done++;
                }
                current=root;
                if(done==0)
                    return new Pair<>(false, nb);
                else
                    return new Pair<>(true,nb);
            }
        current=root;
        return new Pair<>(false,nb); // the element doesn't exist
    }
    @Override
    public List<Pair<Location, List<T>>> getAll() {
        List<Pair<Location, List<T>>> listAll= new LinkedList<>();
         getAll(root,listAll);
        return listAll;
    }
    private void getAll(LocatorNode header,List<Pair<Location, List<T>>> listAll){
        if(header ==null)
            return;
        getAll(header.child_1,listAll);
        List<T> tempList=header.data; // the list in current node
        Pair<Location, List<T>> pos = new Pair<>(header.l, tempList); // the lest of all elements, and the position of this node ( location )
            listAll.insert(pos);
            // if we want to print the data we should check in main if the list is empty print the data , otherwise we will get
           // a null pointer exception because the current will retrieve a null value ( Exception ) cause
          // of the list is empty. The syntax is  if(!NameOfList.retrieve().second.empty()) print...
        getAll(header.child_2,listAll);
        getAll(header.child_3,listAll);
        getAll(header.child_4,listAll);
    }
    @Override
    public Pair<List<Pair<Location, List<T>>>, Integer> inRange(Location lowerLeft, Location upperRight) {
        List< Pair<Location,List<T>> > RangeList = new LinkedList<>();
        int counter = 0;
        if (root == null)
            return new Pair<>(RangeList, counter);

        Stack<Integer, LocatorNode<T>> stack = new Stack<>();
        LocatorNode<T> q = root;

        while (q != null) {
            counter++;
            if (!q.data.empty() && q.l.x >= lowerLeft.x && q.l.x <= upperRight.x
                    && q.l.y >= lowerLeft.y && q.l.y <= upperRight.y) {
                Pair<Location,List<T>> temp= new Pair<>(q.l,q.data);
                RangeList.insert(temp);
            }
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
    }


