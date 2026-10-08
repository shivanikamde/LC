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
    public List<String> recur(TreeNode root,List<String> ls,String str){
        if(root==null){
            return ls;
        }
        if(root.left==null && root.right==null){
            str+=root.val;
            ls.add(str);
            return ls;
        }
        str += root.val+"->";

        recur(root.left,ls,str);
        recur(root.right,ls,str);
        return ls;       
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls1=new ArrayList<String>();
        String str="";
        return recur(root,ls1,str);
    }
}