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
	public int maxPathSum(TreeNode A) {
	    
	    Node node = rec(A);
	    
	    return node.maxSum;
	    
	}
	
	
	public Node rec(TreeNode node) {
	    
	    if (node == null)
	        return null;
	    
	    if (node.left == null && node.right == null) {
	        Node n = new Node();
	        n.maxSum = node.val;
	        n.maxPath = node.val;
	        return n;
	    }
	    
	    Node left, right, n;
	    
	    left = rec(node.left);
	    right = rec(node.right);
	    n = new Node();
	    
	    if (left == null) {
	        n.maxPath = node.val + right.maxPath;
	        n.maxSum = Math.max(n.maxPath, right.maxSum);
	    } else if (right == null) {
	        n.maxPath = node.val + left.maxPath;
	        n.maxSum = Math.max(n.maxPath, left.maxSum);
	    } else {
	        n.maxPath = Math.max(left.maxPath, right.maxPath) + node.val;
	        n.maxSum = Math.max(n.maxPath, left.maxSum);
	        n.maxSum = Math.max(n.maxSum, right.maxSum);
	        n.maxSum = Math.max(n.maxSum, left.maxPath + right.maxPath + node.val);
	    }
	    
	    n.maxPath = Math.max(node.val, n.maxPath);
	    n.maxSum = Math.max(n.maxSum, n.maxPath);
	    
	    return n;
	    
	}
	
	
	class Node {
	    int maxSum;
	    int maxPath;
	}
	
}