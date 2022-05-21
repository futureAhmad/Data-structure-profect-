
public class TreeLocatorMap<K extends Comparable<K>> implements LocatorMap<K> {
    BST<K,Location> bst= new BST<>();
    TreeLocator<K> locator=new TreeLocator<>();

    @Override
    public Map<K, Location> getMap() {
        return bst;
    }

    @Override
    public Locator<K> getLocator() {
        return locator;
    }

    @Override
    public Pair<Boolean, Integer> add(K k, Location loc) {
        Pair<Boolean, Integer> found = bst.find(k);
        if (found.first)
            return new Pair<>(false, found.second);
        bst.insert(k, loc);
        int count = locator.add(k, loc);
        return new Pair<>(true, count);
    }

    @Override
    public Pair<Boolean, Integer> move(K k, Location loc) {
        Pair<Boolean,Integer> change = bst.find(k);
        if(change.first){
            locator.remove(k,bst.retrieve());
            locator.add(k,loc);
            bst.update(loc);
        }
        return change;
    }
    @Override
    public Pair<Location, Integer> getLoc (K k){
            Pair<Boolean, Integer> found = bst.find(k);
            if (!found.first) {
                return new Pair<>(null, found.second);
            } else
                return new Pair<>(bst.retrieve(),found.second);
        }
    @Override
    public Pair<Boolean, Integer> remove (K k){
            Pair<Boolean, Integer> found = bst.find(k);
            if(found.first){
                locator.remove(k, bst.retrieve());
                bst.remove(k);
                return new Pair<>(true,found.second);
            }
            return new Pair<>(false, found.second);
        }

    @Override
    public List<K> getAll () {

            return bst.getAll();
        }

    @Override
    public Pair<List<K>, Integer> getInRange (Location lowerLeft, Location upperRight){
            Pair<List<Pair<Location, List<K>>>, Integer> bigList=locator.inRange(lowerLeft,upperRight);
            List<K> temp= new LinkedList<>();
            List<Pair<Location, List<K>>> RangeList= bigList.first;
            if(!RangeList.empty()){
                RangeList.findFirst();
                while(!RangeList.last()){
                    if(!RangeList.retrieve().second.empty()){
                        RangeList.retrieve().second.findFirst();
                        while(!RangeList.retrieve().second.last()){
                            temp.insert(RangeList.retrieve().second.retrieve());
                            RangeList.retrieve().second.findNext();
                        }
                        temp.insert(RangeList.retrieve().second.retrieve()); // last element in list inside list
                    }
                    RangeList.findNext();
                }
                if(!RangeList.retrieve().second.empty()) // last list in outer list
                    RangeList.retrieve().second.findFirst();
                    while(!RangeList.retrieve().second.last()){
                        temp.insert(RangeList.retrieve().second.retrieve());
                        RangeList.retrieve().second.findNext();
                    }
                    temp.insert(RangeList.retrieve().second.retrieve());
            }
                   return new Pair<>(temp,bigList.second);
        }
}
