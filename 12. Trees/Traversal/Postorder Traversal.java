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
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    
	    print(ar,a);
	    return ar;
	}
	void print(ArrayList<Integer> ar,TreeNode a)
	{
	    if(a==null)
	    return ;
	    
	    print(ar,a.left);
	    print(ar,a.right);
	    ar.add(a.val);
	}
}
