/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reorderList(ListNode a) {
	    if(a==null || a.next==null || a.next.next==null)
	    return a;
	    int size=0;
	    size=length(a);
	    ListNode head1=a,head2=null;
	    ListNode head=head1;
	    int n=(int)Math.floor(size/2);
	    while(n-->1)
	    a=a.next;
	    head2=reverse(a.next);
	    a.next=null;
	    while(head1.next!=null)
	    {
	      ListNode temp=head1.next;
	      ListNode temp1=head2.next;
	      head1.next=head2;
	      head2.next=temp;
	      head1=temp;
	      head2=temp1;
	    }
	    if(head2!=null)
	    head1.next=head2;
	    //print(head1);
	    //System.out.println();
	    //print(head2);
	    //System.out.println();
	    //print(head);
	    return head;
	}
	int length(ListNode a)
	{
	    int count=0;
	    while(a!=null)
	    {
	        count++;
	        a=a.next;
	    }
	    return count;
	}
	void print(ListNode a)
	{
	    while(a!=null)
	    {
	        System.out.print(a.val+" ");
	        a=a.next;
	    }
	}
	ListNode reverse(ListNode a)
	{
	    //int head=a;
	    if(a==null || a.next==null)
	    return a;
	    ListNode temp=null,next=null;
	    while(a!=null)
	    {
	        next=a.next;
	        a.next=temp;
	        temp=a;
	        a=next;
	    }
	    return temp;
	}
	
}
