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
	public int sumNumbers(TreeNode a) {
	    ArrayList<Integer> ar=new ArrayList<>(1);
	    ar.add(0);
	    sum(a,0,ar);
	    return ar.get(0).intValue();
	}
	void sum(TreeNode a,int l,ArrayList<Integer> ar)
	{
	    if(a==null)
	    return;
	    if(a.left==null && a.right==null)
	    {
	        l=(l*10+a.val)%1003;
	        ar.set(0,(ar.get(0)+l)%1003);
	        return;
	    }
	    sum(a.left,(l*10+a.val)%1003,ar);
	    sum(a.right,(l*10+a.val)%1003,ar);
	}
}
