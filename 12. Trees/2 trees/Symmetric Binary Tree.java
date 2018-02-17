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
	public int isSymmetric(TreeNode a) {
	    if(a==null)
	    return 1;
	    //TreeNode b=new TreeNode(a.val);
	    //makeMirror(a,b);
	    /*print(a);
	    System.out.println();
	    print(b);
	    */
	    return check(a,a);
	    //return 0;
	}
	/*public void print(TreeNode a)
	{
	    if(a==null)
	    return;
	    print(a.left);
	    System.out.print(a.val+" ");
	    print(a.right);
	}*/
	
	public int check(TreeNode a,TreeNode b)
	{
	    if(a==null && b==null)
	    return 1;
	    else if((a==null && b!=null) || (a!=null && b==null))
	    return 0;
	    //System.out.println(a.val+" "+b.val);
	    return (a.val==b.val && check(a.left,b.right)==1 && check(a.right,b.left)==1)?1:0;
	}
	
	/*public void makeMirror(TreeNode a,TreeNode b)
	{
	    if(a==null)
	    return;
	    if(a.right!=null)
	    {
	        b.left=new TreeNode(a.right.val);
	    
	        makeMirror(a.right,b.left);
	    }
	    if(a.left!=null)
	    {
	    b.right=new TreeNode(a.left.val);
	    
	    makeMirror(a.left,b.right);
	    }
	}*/
}
