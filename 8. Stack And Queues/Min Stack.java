class Solution {
    ArrayDeque<Integer> st=null;
    int min;
    Solution()
    {
        st=new ArrayDeque<>();
        min=Integer.MAX_VALUE;
    }
    public void push(int x) {
        st.push(x);
        min=Math.min(min,x);
        //System.out.println(st);
    }
 
    public void pop() {
        if(!st.isEmpty())
        {
            int data=st.pop().intValue();
            if(data==min)
            {
               min=Integer.MAX_VALUE;
               Iterator it=st.iterator();
               while(it.hasNext())
               {
                   min=Math.min(min,((Integer)it.next()).intValue());
               }
            }
        }
    }
 
    public int top() {
        if(st.isEmpty())
        return -1;
        return st.peek().intValue();
    }
 
    public int getMin() {
        if(!st.isEmpty())
        return min;
        return -1;
    }
    public void finalize()
    {
        st=null;
    }
}