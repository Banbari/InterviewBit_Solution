public class Solution {
	public String multiply(String a, String b) {
	    if(a.equals("0") || b.equals("0"))
	    return "0";
	    int temp=0;
	    int count=0;
	    int l1=a.length();
	    int l2=b.length();
	    while(a.charAt(temp++)=='0')
	    count++;
	    if(count==l1)
	    return "0";
	    else if(count>0)
	    a=a.substring(count);
	    count=temp=0;
	    while(b.charAt(temp++)=='0')
	    count++;
	    if(count==l2)
	    return "0";
	    else if(count>0)
	    b=b.substring(count);
	    l1=a.length();
	    l2=b.length();
	    temp=0;
	    int a1[]=new int[l1];
	    int b1[]=new int[l2];
	    for(int i=0;i<l1;i++)
	    a1[i]=a.charAt(i)-'0';
	    for(int i=0;i<l2;i++)
	    b1[i]=b.charAt(i)-'0';
	    
	    int sum[]=new int [l1+l2+1];
	    int c=0;
	    int k=l1+l2;
	    count=0;
	    for(int i=l1-1,j=0;i>=0;i--)
	    {
	        c=0;
	        for(j=l2-1,k=l1+l2-count++;j>=0;j--,k--)
	        {
	            
	            int temp1=(a1[i]*b1[j]+sum[k]+c);
	            sum[k]=(temp1)%10;
	            c=(temp1)/10;
	        }
	        if(c>0)
	        {
	            sum[k]=c;
	        }
	    }
	    k=0;
	    count=0;
	    while(sum[k++]==0)
	    count++;
	    StringBuffer sf1=new StringBuffer("");
	    for(int i=count;i<sum.length;i++)
	    sf1.append(sum[i]);
	    String sf=sf1.toString();
	    return sf;
	}
}