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
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
	    ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    Queue<TreeNode> q=new ArrayDeque<>();
	    
	    q.offer(a);
	    while(!q.isEmpty())
	    {
	        ArrayList<Integer> ar=new ArrayList<>();
	        Queue<TreeNode> tempq=new ArrayDeque<>();
	        while(!q.isEmpty())
	        {
	        TreeNode temp=q.poll();
	        ar.add(temp.val);
	        if(temp.left!=null)
	        tempq.offer(temp.left);
	        if(temp.right!=null)
	        tempq.offer(temp.right);
	        }
	        rs.add(ar);
	        q=tempq;
	    }
	    return rs;
	}
}
