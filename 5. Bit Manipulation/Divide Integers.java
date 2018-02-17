public class Solution {
	public long divide(int dividend, int divisor) {
	    long rs=0;
	    try{
	        
	        rs=Math.abs((long)(dividend/divisor));
	        if((dividend<0 && divisor>0)||(dividend>0 && divisor<0))
	    {
	        //System.out.println("Hello");
	        rs*=-1;
	    }
	        if(rs>(long)Integer.MAX_VALUE)
	        throw new Exception();
	        //System.out.println(rs);
	        
	    }
	    catch(Exception e)
	    {
	        //System.out.println("H");
	        return Integer.MAX_VALUE;
	    }
	    
	    return rs; 
	}
}
