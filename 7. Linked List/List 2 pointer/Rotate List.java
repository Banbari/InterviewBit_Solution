/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode rotateRight(ListNode a, int b) {
	    if(a==null || a.next==null)
	    return a;
	    ListNode head=a;
	    int n=ll(a);
	    if(b>n)
	    {
	        b=b%n;
	        if(b==0)
	        return a;
	    }
	    n-=b+1;
	    while(n>0 && a!=null)
	    {
	        a=a.next;
	        n--;
	    }
	    ListNode temp=a.next;
	    a.next=null;
	    ListNode head1=temp;
	    while(temp.next!=null)
	    {
	        temp=temp.next;
	    }
	    temp.next=head;
	    return head1;
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
