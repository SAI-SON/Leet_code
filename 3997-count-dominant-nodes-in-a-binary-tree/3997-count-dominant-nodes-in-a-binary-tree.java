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
    int dominantc=0;
    public int countDominantNodes(TreeNode root) {
        helper(root);
        return dominantc;
    }
    public int helper(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int left=helper(node.left);
        int right=helper(node.right);
        int max=Math.max(left,right);
        
        if(node.val>=max){
            dominantc++;
        }
        return Math.max(node.val,max);
    }
}