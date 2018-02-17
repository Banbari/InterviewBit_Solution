/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> ar, Interval new1) {
    
    ArrayList<Interval> rs=new ArrayList<>();
    ar.add(new Interval(new1.start,new1.end));
    for(int i=ar.size()-1;i>0;i--)
    {
        if(ar.get(i).start<ar.get(i-1).start)
        {
            Collections.swap(ar,i,i-1);
        }
    }
    Stack<Interval> st=new Stack<>();
    st.push(ar.get(0));
    for(int i=1;i<ar.size();i++)
    {
        if(st.peek().end>=ar.get(i).start)
        {
           st.peek().end=Math.max(st.peek().end,ar.get(i).end);
        }
        else
        st.push(ar.get(i));
    }
    while(!st.isEmpty())
    {
        rs.add(st.peek());
        st.pop();
    }
    Collections.reverse(rs);
    return rs;
    }
}
