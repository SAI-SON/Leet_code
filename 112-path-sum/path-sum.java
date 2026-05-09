/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return path_helper( root ,  targetSum ,0);
    }
    public static boolean path_helper(TreeNode root , int targetSum ,int ans){
        if( root == null ){
            return false;
        }
        ans+=root.val;

        if( root.left==null && root.right==null)
        return ans == targetSum;

        if( path_helper(root.left , targetSum, ans) || path_helper(root.right , targetSum, ans) )
        return true;

        return false;
    }
}