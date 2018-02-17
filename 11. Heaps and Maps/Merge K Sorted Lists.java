/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    PriorityQueue<Integer> pq=new PriorityQueue<>();
	    for(int i=0;i<a.size();i++)
	    add(pq,a.get(i));
	    ListNode head=new ListNode(0);
	    ListNode temp=head;
	    while(!pq.isEmpty())
	    {
	        head.next=new ListNode(pq.poll());
	        head=head.next;
	    }
	    return temp.next;
	}
	void add(PriorityQueue<Integer> pq,ListNode a)
	{
	    while(a!=null)
	    {
	        pq.add(a.val);
	        a=a.next;
	    }
	}
}
