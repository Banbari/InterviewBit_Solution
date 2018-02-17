/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    StringBuilder s=new StringBuilder("");
	    while(a!=null)
	    {
	        s.append(a.val);
	        a=a.next;
	    }
	    s.reverse();
	    //System.out.println(s);
	    java.math.BigInteger bg1=new java.math.BigInteger(s.toString());
	    s=new StringBuilder("");
	    while(b!=null)
	    {
	        s.append(b.val);
	        b=b.next;
	    }
	    s.reverse();
	    //System.out.println(s);
	    java.math.BigInteger bg2=new java.math.BigInteger(s.toString());
	    bg1=bg1.add(bg2);
	    //System.out.println(bg1+" "+bg2);
	    s=new StringBuilder(bg1.toString());
	    //System.out.println(s);
	    s.reverse();
	    int n=s.length();
	    ListNode head=new ListNode(-1);
	    ListNode temp=head;
	    for(int i=0;i<n;i++)
	    {
	        temp.next=new ListNode(s.charAt(i)-'0');
	        temp=temp.next;
	    }
	    return head.next;
	}
}
