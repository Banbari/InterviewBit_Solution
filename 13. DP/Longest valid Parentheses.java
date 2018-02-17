public class Solution {
	public int longestValidParentheses(String s) {
	    int count=0;
            int left=-1;
            int max=0;
            boolean fl=false;
            Stack<Integer> st=new Stack<>();
            //System.out.println(" "+s.length());
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(')
                st.push(i);
                else {
                if (st.isEmpty())
                    left=i;
                else{
                    st.pop();
                    if(st.isEmpty())
                        max=Math.max(max,i-left);
                    else
                        max=Math.max(max,i-st.peek());
                    }
                }
            }
            return (max);
	    }
    }
