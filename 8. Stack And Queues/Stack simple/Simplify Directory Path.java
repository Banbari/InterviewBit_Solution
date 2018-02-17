public class Solution {
	public String simplifyPath(String a) {
	    ArrayDeque<String> st=new ArrayDeque<>();
	    for(String s:a.split("/"))
	    {
	        if(s.equals("..") && !st.isEmpty())
	        st.pop();
	        else if(!(s.equals("") || s.equals(".") || s.equals("..")))
	        st.push(s);
	    }
	    StringBuffer ss=new StringBuffer("");
	    //Iterator it=st.iterator();
	    while(!st.isEmpty())
	    {
	        ss.append("/"+st.pollLast());
	    }
	    //System.out.println(st);
	    return ss.length()>1?ss.toString():"/";
	}
}
