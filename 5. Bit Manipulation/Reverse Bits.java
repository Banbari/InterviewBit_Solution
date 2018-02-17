public class Solution {
	public long reverse(long a) {
	    StringBuffer s=new StringBuffer(Long.toBinaryString(a));
	    int i=s.length();
	    s=s.reverse();
	    //System.out.println(s);
	    for(i++;i<=32;i++)
	    s.append("0");
	    long rs=Long.parseLong(s.toString(),2);
	    //System.out.println(s+" "+s.length()+" "+rs);
	    return rs;
	}
}
