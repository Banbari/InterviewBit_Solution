/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    if(m == n) return a;
        ListNode head=a;
        ListNode prev = null;
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);
        
        int i=0;
        ListNode p=a;
        while(p!=null){
            i++;
            if(i==m-1)
                prev=p;
            
            if(i==m)
                first.next=p;
            
            if(i==n){
                second.next=p.next;
                p.next=null;
            }
            p=p.next;
        }
        
        if(first.next==null)
            return a;
        ListNode p1=first.next;
        ListNode p2=p1.next;
        p1.next=second.next;
        while(p1!=null&&p2!=null){
            ListNode t=p2.next;
            p2.next=p1;
            p1=p2;
            p2=t;
          
        }
        if(prev!=null)
            prev.next=p1;
        else
            return p1;
        return head;
	}
	void print(ListNode a)
	{
	    if(a==null)
	    System.out.print("null");
	    while(a!=null)
	    {
	        System.out.print(a.val+" ");
	        a=a.next;
	    }
	    System.out.println();
	}
}
