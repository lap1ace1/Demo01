package leeetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode94 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,null,new TreeNode(2,new TreeNode(3)));
        List<Integer> integers = inorderTraversal(treeNode);
        System.out.println();
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode pre = null;
        while (root!=null){
            if (root.left!=null){
                pre = root.left;
                while (pre.right!=null&&pre.right!=root){
                    pre = pre.right;
                }
                if (pre.right==null){
                    pre.right=root;
                    root=root.left;
                }else {
                    res.add(root.val);
                    root=root.right;
                }
            }else {
                res.add(root.val);
                root=root.right;
            }
        }return res;
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

