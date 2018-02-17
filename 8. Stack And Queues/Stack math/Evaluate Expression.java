public class Solution {
	public int evalRPN(ArrayList<String> a) {
	    Stack<Integer> st=new Stack<>();
	    int result=0;
	    for(String s:a)
	    {
	        
	        if(s.equals("+"))
	        {
	            add(st);
	        }
	        else if(s.equals("-"))
	            sub(st);
	        else if(s.equals("*"))
	            mul(st);
	        else if(s.equals("/"))
	            div(st);
	        else
	            st.push(Integer.parseInt(s));
	        
	       //System.out.println(st);
	    }
	    return st.pop();
	}
	public void add(Stack<Integer> st)
	{
	    int x=st.pop().intValue();
	    int y=st.pop().intValue();
	    int rs=y+x;
	    st.push(rs);
	    
	}
	
	public void sub(Stack<Integer> st)
	{
	    int x=st.pop().intValue();
	    int y=st.pop().intValue();
	    int rs=y-x;
	    st.push(rs);
	}
	
	public void mul(Stack<Integer> st)
	{
	   int x=st.pop().intValue();
	    int y=st.pop().intValue();
	    int rs=y*x;
	    st.push(rs);
	}
	
	public void div(Stack<Integer> st) 
	{
	    int x=st.pop().intValue();
	    int y=st.pop().intValue();
	    int rs=y/x;
	    st.push(rs);
	}
}