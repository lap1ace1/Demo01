package leeetcode;

import javax.swing.tree.TreeNode;

public class leetcode100 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,new TreeNode(1),new TreeNode(2));
        TreeNode treeNode2 = new TreeNode(3,new TreeNode(1),new TreeNode(2));
        System.out.println(isSametree(treeNode2,treeNode));
    }
    public static boolean isSametree(TreeNode q, TreeNode p){
        if (p==null&&q==null){
            return true;
        }else if (p==null||q==null){
            return false;
        }else if (p.val!=q.val){
            return false;
        }
        return isSametree(q.left,p.left)&&isSametree(q.right,p.right);
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
