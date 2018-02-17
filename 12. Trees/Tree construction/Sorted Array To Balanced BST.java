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
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    int n=a.size();
	    TreeNode root=make(a,0,n-1);
	    return root;
	}
	
	public TreeNode make(final List<Integer> a,int l,int h)
	{
	    if(l>h)
	    return null;
	    int mid=(l+h)/2;
	    //System.out.println(l+" "+h+" "+mid);
	    TreeNode root=new TreeNode(a.get(mid));
	    root.left=make(a,l,mid-1);
	    root.right=make(a,mid+1,h);
	    return root;
	}
	
	
	void print(TreeNode a)
	{
	    if(a==null)
	    return;
	    print(a.left);
	    System.out.print(a.val+" ");
	    print(a.right);
	}
}
