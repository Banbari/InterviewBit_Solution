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
	public int minDepth(TreeNode a) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    count=0;
	    find(a,0,ar);
	    if(ar.size()>0)
	    {
	        count=ar.get(0).intValue();
	        for(int i=1;i<ar.size();i++)
	        count=Math.min(ar.get(i).intValue(),count);
	    }
	    return count;
	}
	public void find(TreeNode a,int n,ArrayList<Integer> ar)
	{
	    if(a==null)
	    {
	        return;
	    }
	    
	    find(a.left,n+1,ar);
	    find(a.right,n+1,ar);
	    if(a.left==null && a.right==null)
	    {
	        ar.add(n+1);
	    }
	}
}
