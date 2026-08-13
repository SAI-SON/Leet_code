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
    int first=-1;
    int sec=-1;
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        System.out.println(first+" "+sec);
        return sec;
    }
    void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        if(sec>root.val || sec==-1){
            if(first>root.val || first==-1){
                sec=first;
                first=root.val;
            }
            else if((sec>root.val || sec==-1) && root.val!=first){
                sec=root.val;
            }
        }
        inorder(root.right);
    }
}