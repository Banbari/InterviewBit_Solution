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
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
	    print(ar,a);
	    return ar;
	}
	void print(ArrayList<ArrayList<Integer>> ar,TreeNode a)
	{
	    if(a==null)
	    return;
	    ArrayDeque<TreeNode> temp=new ArrayDeque<>();
	    temp.offer(a);
	    boolean fl=false;
	    while(temp.size()!=0)
	    {
	        ArrayList<Integer> rs=new ArrayList<>(temp.size());
	        ArrayDeque<TreeNode> temp1=new ArrayDeque<>();
	        while(temp.size()!=0)
	        {
	            TreeNode node=temp.poll();
	            rs.add(node.val);
	            if(node.left!=null)
	            temp1.offer(node.left);
	            if(node.right!=null)
	            temp1.offer(node.right);
	        }
	        if(!fl)
	        ar.add(rs);
	        else{
	        Collections.reverse(rs);
	        ar.add(rs);
	        }
	        fl=!fl;
	        temp=temp1;
	    }
	}
}
