public class Solution {
	public int reverse(int a) {
	    try
	    {
	    boolean neg=false;
	    if(a<0)
	    neg=true;
	    StringBuffer s=new StringBuffer(String.valueOf(Math.abs(a)).toString());
	    s=s.reverse();
	    a=Integer.parseInt(s.toString());
	    if(neg) a*=-1;
	    return a;
	    }
	    catch(Exception e)
	    {
	        return 0;
	    }
	}
}
