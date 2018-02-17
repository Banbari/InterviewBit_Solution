public class Solution {
	public int braces(String a) {
	    ArrayDeque<Character> st=new ArrayDeque<>();
	    char ch=' ';
	    for(int i=0;i<a.length();i++)
	    {
	        ch=a.charAt(i);
	        if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/')
	        st.push(ch);
	        else if(ch==')')
	        {
	            int count=0;
	            while(!st.isEmpty() && st.peek()!='(')
	            {
	                st.pop();
	                count++;
	            }
	            if(count==0)
	            return 1;
	            else
	            st.pop();
	        }
	    }
	    return 0;
	}
}
