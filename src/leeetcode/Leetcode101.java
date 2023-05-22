package leeetcode;

public class Leetcode101 {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1,new TreeNode(2),new TreeNode(4));
        TreeNode a2 = new TreeNode(1,new TreeNode(4),new TreeNode(2));
        System.out.println(cheak(a1,a2));


    }
    public static boolean isSymmetric(TreeNode root){
        return cheak(root,root);
    }
    public static boolean cheak(TreeNode q , TreeNode p){
        if (p==null&&q==null){
            return true;
        }else if (p==null||q==null){
            return false;
        }else if (p.val!=q.val){
            return false;
        }
        return cheak(q.left,p.right)&&cheak(q.right,p.left);
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
