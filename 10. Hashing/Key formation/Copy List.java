/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
       RandomListNode head1=new RandomListNode (0);
       RandomListNode head2=head;
       while(head2!=null)
       {
           RandomListNode temp=new RandomListNode(head2.label);
           temp.next=head2.next;
           head2.next=temp;
           if(head2.random!=null)
           head2.next.random=(head2.random.next);
           head2=temp.next;
           //head=head.next;
       }
       head2=head;
       while(head2!=null)
       {
           if(head2.random!=null)
           head2.next.random=(head2.random.next);
           head2=head2.next.next;
       }
       head2=head1;
       while(head!=null)
       {
        head2.next=head.next;
        head.next=head.next.next;
        head2=head2.next;
        head=head.next;
       }
       return head1.next;
    }
}
