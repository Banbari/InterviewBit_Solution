public class Solution {
	public int compareVersion(String a, String b) {
	    StringTokenizer st=new StringTokenizer(a,".");
	    String[] s1=new String[st.countTokens()];
	    int l1=0,l2=0;
	    while(st.hasMoreTokens())
	    s1[l1++]=st.nextToken();
	    st=new StringTokenizer(b,".");
	    String[] s2=new String[st.countTokens()];
	     while(st.hasMoreTokens())
	    s2[l2++]=st.nextToken();
	    int i=0,j=0;
	    while(i<l1 && j<l2)
	    {
	        java.math.BigInteger a1=new java.math.BigInteger(s1[i++]);
	        java.math.BigInteger b1=new java.math.BigInteger(s2[j++]);
	        int rs=a1.compareTo(b1);
	        if(rs!=0)
	        return rs;
	    }
	    java.math.BigInteger zero=new java.math.BigInteger("0");
	    while(i<l1)
	    {
	        java.math.BigInteger a1=new java.math.BigInteger(s1[i++]);
	        if(a1.compareTo(zero)>0)
	        return 1;
	    }
	    while(j<l2)
	    {
	        java.math.BigInteger a1=new java.math.BigInteger(s2[j++]);
	        if(a1.compareTo(zero)>0)
	        return -1;
	    }
	    return 0;
	}
}
