public class Solution {
	public int isNumber(final String a) {
	    String s=a.trim();
	    int l=s.length();
	    int minus=0,plus=0,dot=0,e=0;
	    if(l==0)
	    return 0;
	    for(int i=0;i<l;i++)
	    {
	        if(s.charAt(i)!='.' && s.charAt(i)!='e' && s.charAt(i)!='-' && s.charAt(i)!='+' && !(s.charAt(i)>='0' && s.charAt(i)<='9'))
	        {
	            //System.out.println(s.charAt(i));
	            return 0;
	            
	        }
	        if(i==0 && s.charAt(i)=='e')
	        return 0;
	        if(i==l-1 && (s.charAt(i)=='e' || s.charAt(i)=='.' || s.charAt(i)=='-' || s.charAt(i)=='+'))
	        return 0;
	        if(s.charAt(i)=='-')
	        minus++;
	        else if(s.charAt(i)=='+')
	        plus++;
	        else if(s.charAt(i)=='e')
	        {
	            if(s.charAt(i-1)=='.')
	            return 0;
	        e++;
	        }
	        else if(s.charAt(i)=='.')
	        {
	            if(e==1)
	            return 0;
	        dot++;
	        }
	        if(minus>2 || plus>2 || dot>1 || e>1)
	        return 0;
	    }
	    return 1;
	}
}
