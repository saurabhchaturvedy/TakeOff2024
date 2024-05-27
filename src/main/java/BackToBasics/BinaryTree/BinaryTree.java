package BackToBasics.BinaryTree;

import java.util.Stack;

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


    public void preOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }


    public void inOrderIterative(TreeNode root) {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {

            if (temp != null) {

                stack.push(temp);
                temp = temp.left;
            } else {

                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }


    public void preOrderIterative(TreeNode root) {

        if (root == null) {
            return;
        }


        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode temp = stack.pop();

            System.out.print(temp.data + " ");

            if (temp.right != null) {

                stack.push(temp.right);
            }

            if (temp.left != null) {

                stack.push(temp.left);
            }
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
        //  binaryTree.root.right.right = new TreeNode(7);

        System.out.println(" Pre Order Recursive :: ");
        binaryTree.preOrder(binaryTree.root);

        System.out.println();

        System.out.println(" Pre Order Iterative :: ");
        binaryTree.preOrderIterative(binaryTree.root);

        System.out.println();
        System.out.println(" In Order Recursive :: ");
        binaryTree.inOrder(binaryTree.root);

        System.out.println();
        System.out.println(" In Order Iterative :: ");
        binaryTree.inOrderIterative(binaryTree.root);
    }
}
