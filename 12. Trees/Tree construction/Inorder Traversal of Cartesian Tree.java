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
    public TreeNode buildTree(ArrayList<Integer> a) {
        return make(a,0,a.size()-1);
    }
    TreeNode make(ArrayList<Integer> a,int l,int h)
    {
        if(l>h)
        return null;
        int index=max(a,l,h);
        TreeNode root=new TreeNode(a.get(index));
        root.left=make(a,l,index-1);
        root.right=make(a,index+1,h);
        return root;
    }
    int max(ArrayList<Integer> a,int l,int h)
    {
        int index=l;
        int max=a.get(l);
        for(int i=l+1;i<=h;i++)
        {
            if(max<a.get(i))
            {
                max=a.get(i);
                index=i;
            }
        }
        return index;
    }
}
