public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    String s="";
	    boolean fl=false;
	    int n=a.size(),m=Integer.MAX_VALUE;
	    if(n==0)
	    return s;
	    if(n==1) return a.get(0);
	    for(int i=0;i<n;i++)
	    {
	        int len=a.get(i).length();
	        if(len<m)
	        m=len;
	    }
	    for(int i=0;i<m;i++)
	    {
	        fl=false;
	        for(int j=1;j<n;j++)
	        {
	            if(a.get(j).charAt(i)==a.get(0).charAt(i))
	            {
	                fl=true;
	            }
	            else
	            {
	                return s;
	            }
	        }
	        s+=a.get(0).charAt(i);
	    }
	    return s;
	}
}
