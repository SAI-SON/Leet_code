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
    TreeNode dummy=new TreeNode(0);
    TreeNode curr=dummy;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return dummy.right;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        curr.right=new TreeNode(root.val);
        curr=curr.right;
        inorder(root.right);
    }
}