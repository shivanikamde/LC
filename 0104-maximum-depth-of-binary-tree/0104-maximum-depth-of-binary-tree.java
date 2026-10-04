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
    int max=1;
    int sum=0;
    public int maxHelper(TreeNode root,int sum){
        if(root==null){
            return max;
        }
        sum++;
        max=Math.max(sum,max);
        maxHelper(root.left,sum);
        maxHelper(root.right,sum);
        return max;
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return maxHelper(root,sum);
    }
}