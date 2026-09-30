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

    public boolean isHelper(TreeNode lt, TreeNode rt){
        if(lt==null && rt==null) return true;
        if(lt==null || rt==null) return false;
        if(lt.val != rt.val) return false;

        return isHelper(lt.left,rt.right) && isHelper(lt.right,rt.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isHelper(root.left,root.right);
    }
}