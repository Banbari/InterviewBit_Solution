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
	int count;
	public int maxDepth(TreeNode a) {
	    count=0;
	    find(a,0);
	    return count;
	}
	public void find(TreeNode a,int n)
	{
	    if(a==null)
	    {
	    
	        count=Math.max(count,n);
	    
	        return;
	    }
	    find(a.left,n+1);
	    find(a.right,n+1);
	}
}
