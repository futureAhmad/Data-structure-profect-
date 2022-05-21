public class BSTNode<K extends Comparable<K>, T> {
    K key;
    T data;
    BSTNode<K,T> leftChild, rightChild;

    BSTNode() {
        key = null;
        leftChild = rightChild = null;
    }
    BSTNode(K k, T val) {
        key = k;
        data = val;
        leftChild = rightChild = null;
    }
}
