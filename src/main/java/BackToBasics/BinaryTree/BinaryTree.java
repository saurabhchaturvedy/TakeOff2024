package BackToBasics.BinaryTree;

public class BinaryTree {


    TreeNode root;


    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;


        TreeNode(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {


        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new TreeNode(1);
        binaryTree.root.left = new TreeNode(2);
        binaryTree.root.right = new TreeNode(3);
        binaryTree.root.left.left = new TreeNode(4);
        binaryTree.root.left.right = new TreeNode(5);
        binaryTree.root.right.left = new TreeNode(6);
        binaryTree.root.right.right = new TreeNode(7);
    }
}
