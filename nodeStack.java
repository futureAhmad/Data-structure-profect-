public class nodeStack<K,T> {
    nodeStack next;
    T data;

    nodeStack(){
        data=null;
        next=null;
    }
    nodeStack(T e){
        data=e;
        next=null;
    }
}
