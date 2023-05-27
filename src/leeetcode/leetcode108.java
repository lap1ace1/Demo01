package leeetcode;

import java.util.Arrays;
import java.util.EnumSet;

public class leetcode108 {
    public static void main(String[] args) {
        int[] ints = {3,2,1};
        System.out.println(Arrays.toString(new TreeNode[]{Arrayss(ints)}));
    }
    public static TreeNode Arrayss(int[] nums){
        return helper(nums,0,nums.length-1);
    }
    public static TreeNode helper(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
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
