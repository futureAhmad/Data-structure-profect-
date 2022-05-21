public class Stack<K extends Comparable<K>,T> {
    nodeStack<K,T> top;
    Stack(){
        top=null;
    }
    public boolean empty(){
        return top==null;
    }
    public void push (T e){
        nodeStack<K,T> temp=new nodeStack<>(e);
        temp.next=top;
        top=temp;
    }
    public T pop(){
        if (empty())
            return null;
        T e = top.data;
        top=top.next;
        return e;
    }
}
