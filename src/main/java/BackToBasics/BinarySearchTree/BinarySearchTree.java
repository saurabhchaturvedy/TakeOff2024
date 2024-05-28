package BackToBasics.BinarySearchTree;

public class BinarySearchTree {


    TreeNode root;

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;


        TreeNode(int data) {

            this.data = data;
        }
    }


    private TreeNode insert(TreeNode root, int value) {

        if (root == null) {
            root = new TreeNode(value);
            return root;
        }


        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {

            root.right = insert(root.right, value);
        }


        return root;
    }


    private TreeNode search(TreeNode root, int value) {

        if (root == null || root.data == value) {
            return root;
        }


        if (value < root.data) {
            return search(root.left, value);
        } else {

            return search(root.right, value);
        }
    }


    public void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }


        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    public static void main(String[] args) {


        BinarySearchTree binarySearchTree = new BinarySearchTree();


        TreeNode insert = binarySearchTree.insert(null, 10);
        TreeNode insert1 = binarySearchTree.insert(insert, 20);
        TreeNode insert2 = binarySearchTree.insert(insert1, 30);


        binarySearchTree.inOrder(insert2);

        TreeNode search = binarySearchTree.search(insert2, 20);

        System.out.println();
        System.out.println("searched node is : " + search.data);

    }
}
