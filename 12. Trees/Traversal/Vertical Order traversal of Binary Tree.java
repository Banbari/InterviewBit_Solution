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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        TreeMap<Integer,ArrayList<Integer>> tr=new TreeMap<>();
        print(A,tr,0);
        ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
        for(Map.Entry i:tr.entrySet())
        {
            rs.add((ArrayList<Integer>)i.getValue());
        }
        return rs;
    }
    public void print(TreeNode a,TreeMap<Integer,ArrayList<Integer>> tr,int n)
    {
        if(a==null)
        return;
        Queue<Pair> q=new ArrayDeque<Pair>();
        //ArrayList<Integer> ar=new ArrayList<>();
        //ar.add(a.val);
        q.add(new Pair(a,0));
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            if(tr.containsKey(p.val))
            tr.get(p.val).add(p.key.val);
            else
            {
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(p.key.val);
                tr.put(p.val,ar);
            }
            if(p.key.left!=null)
            q.add(new Pair(p.key.left,p.val-1));
            if(p.key.right!=null)
            q.add(new Pair(p.key.right,p.val+1));
        }
    }
    static class Pair
    {
        TreeNode key;
        int val;
        Pair(TreeNode k,int v)
        {
            key=k;
            val=v;
        }
    }
}