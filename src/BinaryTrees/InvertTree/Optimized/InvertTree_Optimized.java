package BinaryTrees.InvertTree.Optimized;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class InvertTree_Optimized {
    public static TreeNode invertTree(TreeNode root) {
        // Base Case: Agar tree khali hai ya hum leaf node ke paar chale gaye hain
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        // Simply left subtree ko right subtree sa invert kardaygai
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertTree(root);
        printTree(root);
    }
}