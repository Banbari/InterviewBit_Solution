/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public void print(ListNode a)
    {
        while(a!=null)
        {
            System.out.print(a.val+" ");
            a=a.next;
        }
        System.out.println();
    }
	public ListNode sortList(ListNode a) {
	    int n=size(a);
	    return sort(a,n);
	}
	public ListNode sort(ListNode a,int size)
	{
	    if(a==null || a.next==null)
	    return a;
	    if(size>1)
	    {
	        int mid=size/2;
	        ListNode first=a;
	        ListNode second=find(a,mid);
	        //System.out.println("firstPart = "+first.val+"secondPart= "+second.val);
	       // print(first);
	        //print(second);
	        first=sort(first,mid);
	        second=sort(second,size-mid);
	        //print(firstPart);
	        //print(secondPart);
	        ListNode head=new ListNode(-1);
	    ListNode head1=head;
	    //print(first);
	        //print(second);
	    return merge(first,second);
	    }
	    return null;
	}
	public ListNode merge(ListNode first,ListNode second)
	{
	    if(first==null)
	    return second;
	    else if(second==null)
	    return first;
	    ListNode head=new ListNode(-1);
	    ListNode head1=head;
	    //print(first);
	        //print(second);
	    while(first!=null && second!=null)
	    {
	        if(first.val<second.val)
	        {
	            //System.out.print("first = "+first.val+" ");
	            head.next=first;
	            head=head.next;
	            first=first.next;
	            
	        }
	        else
	        {
	            //System.out.print("second = "+second.val+" ");
	            head.next=second;
	            head=head.next;
	            second=second.next;
	        }
	    }
	    if(first!=null)
	    {
	        head.next=first;
	    }
	    if(second!=null)
	    {
	         head.next=second;
	    }
	   
	   return head1.next;
	}
	public ListNode find(ListNode a,int n)
	{
	    for(int i=1;a.next!=null && i<n;i++)
	    a=a.next;
	    ListNode temp=a.next;
	    a.next=null;
	    return temp;
	}
	public int size(ListNode a)
	{
	    if(a==null)
	    return 0;
	    int count=0;
	    while(a!=null)
	    {
	        count++;
	        a=a.next;
	    }
	    return count;
	}
}
