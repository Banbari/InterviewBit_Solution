/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null || root.left==null && root.right==null)
        return root;
        make(root);
        return root;
    }
    void make(TreeNode a)
    {
        if(a==null)
        return;
        TreeNode temp=a.left;
        a.left=a.right;
        a.right=temp;
        make(a.left);
        make(a.right);
    }
}
