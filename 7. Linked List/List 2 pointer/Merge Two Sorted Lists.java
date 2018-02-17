/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
	    ListNode head=null;
     ListNode temp=null;
     if(headA==null)
     return headB;
     if(headB==null)
     return headA;
     if(headA.val<headB.val)
     {
         head=headA;
         headA=headA.next;
     }
     else
     {
         head=headB;
         headB=headB.next;
     }
     temp=head;
     while(headA!=null && headB!=null)
     {
         if(headA.val<headB.val)
         {
             head.next=headA;
             headA=headA.next;
             head=head.next;
         }
         
         else
         {
             head.next=headB;
             headB=headB.next;
             head=head.next;
         }
     }
     if(headA!=null)
     {
         head.next=headA;
     }
     if(headB!=null)
     {
         head.next=headB;
     }
     return temp;
	}
}
