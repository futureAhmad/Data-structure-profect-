public class Node<T> {
    T data;
    Node<T> next;

    Node(){
        data=null;
        next=null;
    }
    Node(T a){
        data=a;
        next=null;
    }
}
