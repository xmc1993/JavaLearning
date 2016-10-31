/**
 * Created by xmc1993 on 16/10/29.
 */
public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int N;

        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x.val;
        if (cmp < 0) return get(x.left, key);
        return get(x.right, key);
    }

    public void put(Key key, Value val) {

    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp == 0) x.val = value;
        else if (cmp < 0) x.left = put(x.left, key, value);
        else x.right = put(x.right, key, value);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Key min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x == null) throw new NullPointerException();
        if(x.left == null) return x;
        return min(x.left);
    }

    public Key max(){
        return max(root).key;
    }

    private Node max(Node x){
        if(x == null) throw new NullPointerException();
        if(x.right == null) return x;
        return min(x.right);
    }

    public Key floor(Key key){
        return null;
    }

    private Node floor(Node node, Key key){
        int cmp = key.compareTo(node.key);
        if (cmp == 0) return node;
//        if(cmp < 0)
        return null;
    }

    public Key ceiling(){
        return null;
    }
}
