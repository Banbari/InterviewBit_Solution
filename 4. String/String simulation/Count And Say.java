public class Solution {
	public String countAndSay(int a) {
	    StringBuffer s=new StringBuffer("11");
	    if(a==0)
	    return "";
	    if(a==1)
	    return "1";
	    if(a==2)
	    return s.toString();
	    for(int i=2;i<a;i++)
	    {
	        StringBuffer rs=new StringBuffer("");
	        int count=1,j=1;
	        for(j=1;j<s.length();j++)
	        {
	            if(s.charAt(j)==s.charAt(j-1))
	            count++;
	            else
	            {
	                rs.append(count);
	                rs.append(s.charAt(j-1));
	                count=1;
	            }
	        }
	        rs.append(count);
	        rs.append(s.charAt(j-1));
	        s=rs;
	    }
	    return s.toString();
	}
}
