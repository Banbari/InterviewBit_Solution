public class Solution {
	public int strStr(final String h, final String n) {
	    if(n.length()==0)
	    return -1;
	    else if(h.length()==0)
	    return -1;
	    for(int i=0,j=0;i<h.length();i++)
	    {
	        if(h.charAt(i)==n.charAt(0))
	        {
	            for( j=1;j<n.length() && i+j<h.length();j++)
	            {
	                if(h.charAt(i+j)!=n.charAt(j))
	                break;
	            }
	            if(j==n.length())
	            return i;
	        }
	    }
	    return -1;
	}
}
