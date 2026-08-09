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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return rec(p.left,q.left) && rec(p.right,q.right);
        
    }
    public boolean rec(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1== null || node2==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }
        boolean left=rec(node1.left,node2.left);
        boolean ryt = rec(node1.right,node2.right);
        return left && ryt;
    }
}
