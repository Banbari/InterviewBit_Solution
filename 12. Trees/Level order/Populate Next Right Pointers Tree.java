/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)
        return;
        root.next=null;
        while(root!=null)
        {
            TreeLinkNode curr=root;
            while(curr!=null)
            {
                if(curr.left!=null)
                {
                    if(curr.right!=null)
                    {
                        curr.left.next=curr.right;
                    }
                    else
                    curr.left.next=getNextRight(curr);
                }
                if(curr.right!=null)
                {
                    curr.right.next=getNextRight(curr);
                }
                curr=curr.next;
            }
            if(root.left!=null)
            root=root.left;
            else if(root.right!=null)
            root=root.right;
            else
            root=getNextRight(root);
        }
    }
    TreeLinkNode getNextRight(TreeLinkNode root)
    {
        TreeLinkNode next=root.next;
        while(next!=null)
        {
            if(next.left!=null)
            return next.left;
            if(next.right!=null)
            return next.right;
            next=next.next;
        }
        return null;
    }
}
