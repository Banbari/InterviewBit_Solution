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
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    Stack<TreeNode> st=new Stack<>();
	    while(true)
	    {
	        while(a!=null)
	        {
	            st.push(a);
	            a=a.left;
	        }
	        if(st.isEmpty())
	        break;
	        a=st.pop();
	        ar.add(a.val);
	        a=a.right;
	    }
	    //print(ar,a);
	    return ar;
	}
	public void print(ArrayList<Integer> ar,TreeNode root)
	{
	    if(root==null)
	    return;
	    print(ar,root.left);
	    ar.add(root.val);
	    print(ar,root.right);
	}
}
