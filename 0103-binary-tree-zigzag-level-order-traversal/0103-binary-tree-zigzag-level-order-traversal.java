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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        bfs(root);
        return list;
    }
    void bfs(TreeNode root){
        if(root==null) return ;
        Stack<TreeNode> even=new Stack<>();
        Stack<TreeNode> odd=new Stack<>();
        even.push(root);
        int level=0;
        while(!even.isEmpty() || !odd.isEmpty()){
            List<Integer>templist=new ArrayList<>();
            if(level%2==0){
                int size=even.size();
                for(int i=0;i<size;i++){
                    TreeNode tempeven=even.pop();
                    templist.add(tempeven.val);
                    if(tempeven.left!=null){
                    odd.push(tempeven.left);
                    }
                    if(tempeven.right!=null){
                    odd.push(tempeven.right);
                    }
                }
                list.add(templist);
            }
            else{
                int size=odd.size();
                for(int i=0;i<size;i++){
                    TreeNode tempodd=odd.pop();
                    templist.add(tempodd.val);
                    if(tempodd.right!=null){
                    even.push(tempodd.right);                    
                    }
                    if(tempodd.left!=null){
                    even.push(tempodd.left);
                    }
                }
                list.add(templist);

            }
            level++;
        }

    }
}