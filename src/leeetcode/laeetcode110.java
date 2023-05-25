package leeetcode;

public class laeetcode110 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(bl(treeNode));

    }
    public static boolean bl(TreeNode root){
        if (root==null){
            return true;
        }else {
            return Math.abs(h(root.left)-h(root.right))<=1&&bl(root.left)&&bl(root.right);
        }
    }public static int h(TreeNode root){
        if (root==null){
            return 0;
        }else {
            return Math.max(h(root.left),h(root.right))+1;
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
