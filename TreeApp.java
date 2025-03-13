import java.util.ArrayList;

public class TreeApp{
    public static void main(String args[]){
        ArrayList<Tree> treeList = new ArrayList<>();
        Tree node1 = new Tree(20);
        Tree node2 = new Tree(10);
        Tree node3 = new Tree(30);
        Tree node4 = new Tree(5);
        Tree node5 = new Tree(15);
        Tree node6 = new Tree(25);
        Tree node7 = new Tree(35);
        node1.setLeft(node2);
        node2.setParent(node1);
        node1.setRight(node3);
        node3.setParent(node1);
        node2.setLeft(node4);
        node4.setParent(node2);
        node2.setRight(node5);
        node5.setParent(node2);
        node3.setLeft(node6);
        node6.setParent(node3);
        node3.setRight(node7);
        node7.setParent(node3);
        treeList.add(node1);
        treeList.add(node2);
        treeList.add(node3);
        treeList.add(node4);
        treeList.add(node5);
        treeList.add(node6);
        treeList.add(node7);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        ArrayList<Integer> answer2 = new ArrayList<Integer>();
        ArrayList<Integer> answer3 = new ArrayList<Integer>();
        inOrder(node1, answer);
        preOrder(node1, answer2);
        postOrder(node1, answer3);
    }

    public static void inOrder(Tree node, ArrayList<Integer> answer) {
        //ArrayList<Integer> traversed = new ArrayList<Integer>();
        if (node.getLeft() != null) {
            inOrder(node.getLeft(), answer);
        }
        answer.add(node.getValue());
        if (node.getRight() != null) {
            inOrder(node.getRight(), answer);
        }
        System.out.println(answer);
    }

    public static void preOrder(Tree node, ArrayList<Integer> answer) {
        //ArrayList<Integer> traversed = new ArrayList<Integer>();
        answer.add(node.getValue());
        if (node.getLeft() != null) {
            preOrder(node.getLeft(), answer);
        }
        if (node.getRight() != null) {
            preOrder(node.getRight(), answer);
        }
        System.out.println(answer);
    }

    public static void postOrder(Tree node, ArrayList<Integer> answer) {
        //ArrayList<Integer> traversed = new ArrayList<Integer>();
        if (node.getLeft() != null) {
            postOrder(node.getLeft(), answer);
        }
        if (node.getRight() != null) {
            postOrder(node.getRight(), answer);
        }
        answer.add(node.getValue());
        System.out.println(answer);
    }

}