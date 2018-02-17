/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode a) {
	    if(a==null || a.next==null)
	    return a;
	    ListNode head=a.next,prev=null;
	    while(a!=null && a.next!=null)
	    {
	        ListNode temp=a.next;
	        a.next=temp.next;
	        temp.next=a;
	        if(prev!=null)
	        prev.next=temp;
	        prev=a;
	        a=a.next;
	    }
	    return head;
	}
}
