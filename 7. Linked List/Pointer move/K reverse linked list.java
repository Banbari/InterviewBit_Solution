/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode head=new ListNode(-1);
        ListNode head1=head;
        ListNode next=nextNode(A,B);
        while(next!=null)
        {
            ListNode temp=reverse(A);
            A=next;
            head1.next=temp;
            head1=shiftHead(head1);
            next=nextNode(A,B);
        }
        ListNode temp=reverse(A);
            A=next;
            head1.next=temp;
            head1=shiftHead(head1);
            return head.next;
    }
    ListNode shiftHead(ListNode a)
    {
        while(a.next!=null)
        a=a.next;
        return a;
    }
    ListNode reverse(ListNode a)
    {
        ListNode temp=null;
        while(a!=null)
        {
            ListNode next1=a.next;
            a.next=temp;
            temp=a;
            a=next1;
        }
        return temp;
    }
    ListNode nextNode(ListNode a,int b)
    {
        while(--b>0)
        {
            a=a.next;
        }
        ListNode temp=a.next;
        a.next=null;
        return temp;
    }
}
