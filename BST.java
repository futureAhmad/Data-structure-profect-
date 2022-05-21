
public class BST<K extends Comparable<K>, T> implements Map<K, T> {
    public BSTNode<K,T> root,current;
    @Override
    public boolean empty() { return root==null; }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public T retrieve() {
        return current.data;
    }

    @Override
    public void update(T e) {
        current.data=e;
    }

    @Override
    public Pair<Boolean, Integer> find(K key) {
        boolean found=false;
        int nb=0;
        if(empty())
            return new Pair<Boolean,Integer>(found,nb);
        if (root.leftChild==null && root.rightChild==null && key.compareTo(root.key)==0)
            return new Pair<>(true,1);
        else {
            BSTNode<K,T> q=root;
            while(q!=null){
                if(key.compareTo( q.key)>0)
                    q=q.rightChild;
                else
                    if(key.compareTo( q.key)<0)
                        q=q.leftChild;
                    else {
                        found = true;
                        ++nb;
                        current=q;
                        break;
                    }
                ++nb;
            } // end of while
            return new Pair<>(found,nb);
        } // end else
    }

    @Override
    public Pair<Boolean, Integer> insert(K key, T data) {
        int nb=0;
        BSTNode<K,T> old= current;
        Pair<Boolean,Integer> look= find(key);
        if(look.first) {
            current=old;
            return new Pair<>(false, look.second);
        }
        BSTNode<K,T> temp=new BSTNode<>(key,data);
        if(empty()){
            current = root = temp;
            return new Pair<>(true,nb);
        }else{
            BSTNode<K,T> q=root, p=root;
            while(q!=null){
                p=q;
                if(key.compareTo( q.key)>0)
                    q=q.rightChild;
                else
                if(key.compareTo( q.key)<0)
                    q=q.leftChild;
                ++nb;
            }
            if(key.compareTo(p.key)>0)
                p.rightChild=temp;
            else
                p.leftChild=temp;
            current=temp;
            return new Pair<>(true,nb);
        }
    }
    @Override
    public Pair<Boolean, Integer> remove(K key) {
        int nb=0;
        Pair<Boolean,Integer> look= find(key);
        if(look.first) {
            BSTNode<K,T> q=root, p=root;
            while (p!=null && p.key!=key){
                q=p;
                if(key.compareTo(p.key)<0)
                    p=p.leftChild;
                else
                    p=p.rightChild;
                ++nb;
            }
            if(p==null)
                return new Pair<>(false,nb);
            if(p.leftChild!=null && p.rightChild!=null) {
                q = p;
                BSTNode<K,T> min= p.rightChild;
                while (min.leftChild != null) {
                    q = min;
                    min = min.leftChild;
                }
                p.key = min.key;
                p.data = min.data;
                key = min.key;
                p = min;
            }//case 1,2
            if(p.leftChild!=null)
                p=p.leftChild;
            else
                p=p.rightChild;
            if(q==null)
                root=p;
            else{
                if(key.compareTo(q.key)<0)
                    q.leftChild=p;
                else
                    q.rightChild=p;
            }
            current=root;
            return new Pair<>(true,nb);
        }else
        return new Pair<>(false, look.second); // The key is does not exist
    }

    @Override
    public List<K> getAll() {
        if(empty())
            return null;
        LinkedList<K> l=new LinkedList<>();
        getAll(root,l);
        return l;
    }
    private void getAll(BSTNode<K,T> e,LinkedList<K> l) {
        if(e==null)
            return;
        getAll(e.leftChild,l);
        l.insert(e.key);
        getAll(e.rightChild,l);
    }

}
