package leeetcode;

public class leetcode2236 {
    public static void main(String[] args) {
        TreeNode tr = new TreeNode(10,new TreeNode(4),new TreeNode(6));
        System.out.println(checkTree(tr));
    }
    public static boolean checkTree(TreeNode root) {
        if (root.left.val+root.right.val!= root.val){
            return false;
        }return true;
    }
}


