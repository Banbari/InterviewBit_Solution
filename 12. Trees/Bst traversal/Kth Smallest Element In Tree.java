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
    public int kthsmallest(TreeNode root, int k) {
        List<Integer> q=new ArrayList<>();
        print(root,q);
        return q.get(k-1).intValue();
    }
    public void print(TreeNode a,List<Integer> ar)
    {
        if(a==null)
        return;
        //if(a.left!=null)
        print(a.left,ar);
        ar.add(a.val);
        print(a.right,ar);
    }
}
