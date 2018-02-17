/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    int n=ll(a);
	    if(b>n)
	    return a.next;
	    ListNode head=a;
	    if(b==n)
	    return head.next;
	    n-=b+1;
	    while(n>0 && a!=null)
	    {
	        a=a.next;
	        n--;
	    }
	    if(a.next!=null)
	    a.next=a.next.next;
	    return head;
	}
	public int ll(ListNode a) {
	    int n=0;
	    while(a!=null)
	    {
	        n++;
	        a=a.next;
	    }
	    return n;
	}
}
