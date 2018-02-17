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
	public int hasPathSum(TreeNode a, int b) {
	    //if(a==null && b==0)
	    //return 1;
	    if(a==null)
	    return 0;
	    if(a.left==null && a.right==null)
	    {
	        return b-a.val==0?1:0;
	    }
	    return (hasPathSum(a.left,b-a.val)==1 || hasPathSum(a.right,b-a.val)==1)?1:0;
	}
}
