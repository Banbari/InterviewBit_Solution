/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode partition(ListNode a, int b) {
	    if(a==null || a.next==null)
	    return a;
	    Queue<ListNode> q=new ArrayDeque<>();
	    ListNode temp=a;
	    ListNode head=null;
	    boolean fl=false;
	    if(temp.val>=b)
	    q.add(temp);
	    else{
	        head=temp;
	        fl=true;
	    }
	    while(temp.next!=null)
	    {
	        if(temp.next.val>=b)
	        {
	            q.add(temp.next);
	            temp.next=temp.next.next;
	        }
	        else
	        {
	            if(!fl)
	            {
	                head=temp.next;
	                fl=true;
	            }
	            temp=temp.next;
	        }
	        //temp=temp.next;
	    }
	    while(!q.isEmpty())
	    {
	        temp.next=(ListNode)q.poll();
	        temp=temp.next;
	    }
	    temp.next=null;
	    return head==null?a:head;
	}
	void print(ListNode a)
	{
	    while(a!=null)
	    {
	        System.out.print(a.val+" ");
	        a=a.next;
	    }
	}
}
