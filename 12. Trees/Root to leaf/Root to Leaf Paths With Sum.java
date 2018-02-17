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
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
	    ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    ArrayDeque<Integer> path=new ArrayDeque<>();
	    //print(root);
	    find(root,sum,rs,path,1);
	    return rs;
	}
	void print(TreeNode a)
	{
	    if(a==null)
	    {
	        System.out.print("\t");
	        return;
	    }
	    System.out.print(a.val+" ");
	    print(a.left);
	    print(a.right);
	}
	public void find(TreeNode root,int sum,ArrayList<ArrayList<Integer>> rs,ArrayDeque<Integer> path,int count)
	{
	    if(root==null)
	    return;
	    if(root.left==null && root.right==null)
	    {
	        if(sum-root.val==0)
	        {
	            ArrayList<Integer> temp=new ArrayList<>(path.size()+1);
	            //path.subList(0,count);
	            //System.out.println(path);
	            for(Integer i:path)
	            temp.add((i).intValue());
	            temp.add(root.val);
	            rs.add(temp);
	        }
	        return;
	    }
	    //if(count>path.size())
	    path.offer(root.val);
	    //else
	    //path.set(count-1,root.val);
	    
	    find(root.left,sum-root.val,rs,path,count+1);
	    find(root.right,sum-root.val,rs,path,count+1);
	    path.pollLast();
	}
}
