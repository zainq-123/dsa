package BinaryTrees.MaxDepth_Brute.Optimized;
import java.util.*;

class TreeNode{
    int val;
    TreeNode left; TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}

public class MaxDepth_Optimized {
    static int MaxDepth_Optimized(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = MaxDepth_Optimized(root.left);
        int rightDepth = MaxDepth_Optimized(root.right);

        // Dono mein se jo bada ho, usme 1 plus kar ke return karein
        return Math.max(leftDepth, rightDepth) + 1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(MaxDepth_Optimized(root));


    }
}