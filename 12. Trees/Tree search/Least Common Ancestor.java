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
	public int lca(TreeNode a, int val1, int val2) {
	    boolean left=check(a,val1);
	    boolean right=check(a,val2);
	    if(left && right)
	    {
	    TreeNode l=lca1(a,val1,val2);
	    return l!=null?l.val:-1;
	    }
	    else
	    return -1;
	}
	boolean check(TreeNode a,int val1)
	{
	    if(a==null)
	    return false;
	    if(a.val==val1)
	    return true;
	    return check(a.left,val1) || check(a.right,val1);
	}
	TreeNode lca1(TreeNode a,int val1,int val2)
	{
	    if(a==null)
	    return null;
	    if(a.val==val1 || a.val==val2)
	    return a;
	    TreeNode left=lca1(a.left,val1,val2);
	    TreeNode right=lca1(a.right,val1,val2);
	    if(left!=null && right!=null)
	    return a;
	    if(left==null && right==null)
	    return null;
	    return left!=null?left:right;
	}
}
