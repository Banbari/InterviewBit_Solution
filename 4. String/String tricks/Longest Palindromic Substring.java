public class Solution {
    int st,end,max;
	public String longestPalindrome(String a) {
	    if(a.length()<2)
	    return a;
	    for(int i=0;i<a.length();i++)
	    {
	        expend(a,i,i);
	        expend(a,i,i+1);
	    }
	    return a.substring(st,end);
	    	}
	    public void expend(String s,int i,int j)
	    {
	        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
	        {
	            i--;
	            j++;
	        }
	        if(max<j-i-1)
	        {
	            st=i+1;
	            end=j;
	            max=j-i-1;
	        }
	    }
}
