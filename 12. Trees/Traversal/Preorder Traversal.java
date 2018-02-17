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
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    Deque<TreeNode> st=new ArrayDeque<>();
	    TreeNode curr=a;
	    while(curr!=null || !st.isEmpty())
	    {
	        if(curr!=null)
	        {
	            st.push(curr);
	            curr=curr.left;
	        }
	        else
	        {
	            TreeNode temp=st.peek().right;
	            if(temp==null)
	            {
	                temp=st.pop();
	                ar.add(temp.val);
	                System.out.print(temp.val+" ");
	                while(!st.isEmpty() && temp==st.peek().right)
	                {
	                    temp=st.pop();
	                    ar.add(temp.val);
	                System.out.print(temp.val+" ");
	                }
	            }
	            else
	            curr=temp;
	        }
	    }
	    //print(ar,a);
	    return ar;
	}
	void print(ArrayList<Integer> ar,TreeNode a)
	{
	    if(a==null)
	    return ;
	    ar.add(a.val);
	    print(ar,a.left);
	    print(ar,a.right);
	}
}
