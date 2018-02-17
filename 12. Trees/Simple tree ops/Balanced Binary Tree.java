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
	public int isBalanced(TreeNode a) {
	    if(a==null)
	    return 1;
	    if(check(a)==-1)
	    return 0;
	    else
	    return 1;
	}
	public int check(TreeNode a)
	{
	    if(a==null)
	    return 0;
	    //if(a.left==null && a.right==null)
	    //return 1;
	    int left=check(a.left);
	    if(left==-1)
	    return -1;
	    int right=check(a.right);
	    if(right==-1)
	    return -1;
	    if((int)Math.abs(left-right)>1)
	    return -1;
	    return Math.max(left,right)+1;
	}
}
