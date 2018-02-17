public class Solution {
    HashMap<Integer,Node> hm=null;
    int n,cap;
    Node head,tail;
    public Solution(int capacity) {
        n=capacity;
        hm=new HashMap<Integer,Node>();
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
        cap=0;
    }
    void add(Node temp)
    {
        temp.next=head.next;
        head.next.prev=temp;
        temp.prev=head;
        head.next=temp;
    }
    void remove(Node temp)
    {
        Node pre=temp.prev,next=temp.next;
        pre.next=next;
        next.prev=pre;
    }
    void update(Node temp)
    {
        remove(temp);
        add(temp);
    }
    public int get(int key) {
        Node val=hm.get(key);
        //System.out.println(cap);
        if(val==null)
        return -1;
        else
        {
            update(val);
            return val.val;
        }
    }
    
    public void set(int key, int value) {
        Node val=hm.get(key);
        if(val==null)
        {
        Node temp=new Node();
        temp.key=key;
        temp.val=value;
        add(temp);
        hm.put(key,temp);
        cap++;
        }
        else
        {
            val.val=value;
            update(val);
        }
        if(cap>n)
        {
            Node temp=tail.prev;
            remove(temp);
            hm.remove(temp.key);
            cap--;
        }
    }
    static class Node
    {
        int val,key;
        Node next,prev;
    }
}
