package leeetcode;

import javax.swing.tree.TreeNode;

public class leetcode104 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(maxDepth(a));

    }
    public static int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }else {
            int liftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(liftHeight,rightHeight)+1;
        }

    }
    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}
