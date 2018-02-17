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
    int postIndex;
	public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
	    postIndex=inorder.size()-1;
	    return make(inorder,postorder,0,inorder.size()-1);
	}
	TreeNode make(ArrayList<Integer> in,ArrayList<Integer> post,int l,int h)
	{
	    if(l>h)
	    return null;
	    TreeNode root=null;
	    int index=find(in,post,l,h);
	    root=new TreeNode(in.get(index));
	    postIndex--;
	    root.right=make(in,post,index+1,h);
	    root.left=make(in,post,l,index-1);
	    return root;
	}
	int find(ArrayList<Integer> in,ArrayList<Integer> post,int l,int h)
	{
	    int val=post.get(postIndex);
	    for(int i=l;i<=h;i++)
	    if(in.get(i)==val)
	    return i;
	    return l;
	}
}
