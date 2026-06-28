package BinaryTrees.MaxDepth_Brute.Brute;
import java.util.*;

class TreeNode{
int val;
TreeNode left; TreeNode right;

public TreeNode(int val){
    this.val=val;
}
}

public class Max_DepthBrute {
    static int MaxDepth_Brute(TreeNode root){
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        // Jab tak queue khali nahi hoti, level by level aage barhein
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Is level par kitne nodes hain
            depth++; // Naya level shuru hua to depth barha di

            // Is level ke saare nodes ko process karo aur unke children ko queue mein daalo
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        return depth;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(MaxDepth_Brute(root));

    }
}
