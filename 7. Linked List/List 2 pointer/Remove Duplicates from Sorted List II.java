/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    ArrayList<ListNode> temp=new ArrayList<>();
	    if(a==null || a.next==null)
	    return a;
	    boolean fl=false;
	    while(a!=null)
	    {
	        
	            if(temp.size()>0 && a.val==temp.get(temp.size()-1).val)
	            {
	                a=a.next;
	                fl=true;
	                //System.out.print(temp.size()+" ");
	                continue;
	            }
	            else
	            {
	        if(fl)
	        temp.remove(temp.size()-1);
	        temp.add(a);
	        fl=false;
	        a=a.next;
	        
	            }
	    }
	    if(fl)
	    temp.remove(temp.size()-1);
	    ListNode head=null;
	    if(temp.size()>0)
	    head=new ListNode(temp.get(0).val);
	    a=head;
	    for(int i=1;i<temp.size();i++)
	            {a.next=new ListNode(temp.get(i).val);a=a.next;}
	            //System.out.println();
	            //System.out.print(temp.size()+"\n");
	    return head;
	}
}
