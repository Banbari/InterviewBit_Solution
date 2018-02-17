public class Solution {
	public int atoi(final String a) {
	    String s[]=a.trim().split(" ");
	    StringBuffer s1=new StringBuffer("");
	    int temp=0;
	    do
	    {
	        if(temp>=s.length)
	        break;
	        s1=find(s1,s[temp++]);
	        if(s1.length()==0)
	        return 0;
	    }while(s1.length()<=0);
	    s[0]=s1.toString();
	    //System.out.println(s1);
	    if(s1.length()==0)
	    return 0;
	    else if(s1.length()==1 && (s1.charAt(0)=='-' || s1.charAt(0)=='+'))
	    return 0;
	    int x=Integer.MIN_VALUE;
	    try
	    {
	    x=Integer.parseInt(s[0]);
	    if(!String.valueOf(x).equals(s[0]) && s[0].charAt(0)=='-')
	    return Integer.MIN_VALUE;
	    else if(!String.valueOf(x).equals(s[0]))
	    return Integer.MAX_VALUE;
	    return x;
	    }
	    catch(Exception e)
	    {
	        if(!String.valueOf(x).equals(s[0]) && s[0].charAt(0)=='-')
	    return Integer.MIN_VALUE;
	    else if(!String.valueOf(x).equals(s[0]))
	    return Integer.MAX_VALUE;
	    if(s[0].length()>11 && s[0].charAt(0)=='-')
	    return Integer.MIN_VALUE;
	    else if(s[0].length()>10)
	    return Integer.MAX_VALUE;
	        return 0;
	    }
	    //return 0;
	}
	public static StringBuffer find(StringBuffer s1,String s)
	{
	    if(s!=null && (s.charAt(0)=='-' || (s.charAt(0)>='0' && s.charAt(0)<='9')))
	    s1.append(s.charAt(0));
	    //System.out.println(s1);
	    else if(s!=null && (s.charAt(0)=='+'))
	    {
	        
	    }
	    else
	    return s1;
	    if(s1.length()==1 && s1.charAt(0)=='0')
	    s1=new StringBuffer("");
	    for(int i=1;i<s.length();)
	    if(s.charAt(i)>='0' && s.charAt(i)<='9')
	    {
	        if(s1.length()==0 && s.charAt(i)=='0')
	        {
	            i++;
	        }
	        else if(s1.length()==1 && s.charAt(i)=='0' && (s1.charAt(0)=='-' || s1.charAt(0)=='+'))
	        {
	            i++;
	        }
	        else
	        {
	        s1.append(s.charAt(i));
	        i++;
	        }
	    }
	    else
	    break;
	    return s1;
	}
}
