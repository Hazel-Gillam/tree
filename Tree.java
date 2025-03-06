public class Tree {
    private int value;
    private Tree left;
    private Tree right;

    public Tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getLeft() {
        return this.left;
    }
        
    public void setRight(Tree right) {
        this.right = right;
    }
        
    public Tree getRight() {
        return this.right;
    }
       
    public int getValue() {
        return this.value;
    }
}