public class LocatorNode <T>{
    LocatorNode<T> child_1,child_2,child_3,child_4;
    List<T> data;
    Location l;
    LocatorNode(List<T> e, Location x){
        l=x; data=e;
        child_1=child_2=child_3=child_4=null;
    }
}
