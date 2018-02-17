/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    int n;
    ArrayList<TreeNode> rs=null;
    public Solution(TreeNode root) {
        rs=new ArrayList<>();
        make(root,rs);
        n=0;
    }
    public void make(TreeNode a,ArrayList<TreeNode> ar)
    {
        if(a==null)
        return;
        make(a.left,ar);
        ar.add(a);
        make(a.right,ar);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return n<rs.size();
    }

    /** @return the next smallest number */
    public int next() {
        return rs.get(n++).val;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
