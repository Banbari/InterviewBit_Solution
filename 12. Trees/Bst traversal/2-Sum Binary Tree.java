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
    public int t2Sum(TreeNode A, int B) {
        HashSet<Integer> hs=new HashSet<>();
        if(call(A,B,hs))
        return 1;
        else
        return 0;
    }
    
    boolean call(TreeNode a,int b,HashSet<Integer> hs)
    {
        if(a==null)
        return false;
        if(hs.contains(b-a.val))
        return true;
        hs.add(a.val);
        return call(a.left,b,hs) || call(a.right,b,hs);
    }
}
