import java.util.ArrayList;

public class TreeApp{
    public static void main(String args[]){
        ArrayList<Tree> treeList = new ArrayList<>();
        Tree node1 = new Tree(8);
        Tree node2 = new Tree(4);
        Tree node3 = new Tree(14);
        Tree node4 = new Tree(1);
        Tree node5 = new Tree(7);
        Tree node6 = new Tree(11);
        Tree node7 = new Tree(23);
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);
        treeList.add(node1);
        treeList.add(node2);
        treeList.add(node3);
        treeList.add(node4);
        treeList.add(node5);
        treeList.add(node6);
        treeList.add(node7);
        System.out.println(inOrder(treeList));
    }

    public static ArrayList<Integer> inOrder(ArrayList<Tree> tree) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        //ArrayList<Integer> traversed = new ArrayList<Integer>();
        Tree node = tree.get(0);
        Tree prev = node;
        while (answer.size() != tree.size()) {
            while (node.getLeft() != null) {
                prev = node;
                node = node.getLeft();
            }
           answer.add(node.getValue());
        }
        return answer;
    }
}