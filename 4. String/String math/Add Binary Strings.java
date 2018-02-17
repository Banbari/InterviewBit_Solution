public class Solution {
	public String addBinary(String a, String b) {
	    StringBuilder s=new StringBuilder("");
	    int c=0,i=0;
	    int l1=a.length();
	    int l2=b.length();
	    if(l1<l2)
	    a=update(a,l2-l1);
	    else if(l2<l1)
	    b=update(b,l1-l2);
	    int l=a.length();
	    //System.out.println(a+" "+b);
	    for(i=0;i<l;i++)
	    {
	        int x=a.charAt(l-i-1)-'0',y=b.charAt(l-i-1)-'0';
	        int xx=x^y^c;
	        s.append(xx);
	        c=(x&y)|(y&c)|(c&x);//==1?0:1;
	        
	        //System.out.print(x);
	    }
	    //System.out.println(c);
	    if(c==1) s.append(1);
	    return s.reverse().toString();
	}
	public String update(String s,int x)
	{
	    StringBuilder rs=new StringBuilder(s);
	    rs=rs.reverse();
	    while(x-->0)
	    rs.append(0);
	    return rs.reverse().toString();
	}
}
