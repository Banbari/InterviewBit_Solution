/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null)
        return 1;
        ListNode temp1=head;
        Stack<ListNode> st=new Stack<>();
        while(temp1!=null && temp1.next!=null)
        {
            st.push(temp);
            temp=temp.next;
            temp1=temp1.next.next;
            
        }
        if(temp1!=null)
        temp=temp.next;
        while(!st.isEmpty() && temp!=null)
        {
            if(st.peek().val!=temp.val)
            return 0;
            st.pop();
            temp=temp.next;
        }
        return 1;
    }
}
