public class Solution {
	public ArrayList<Integer> grayCode(int a) {
	    ArrayList<Integer> rs=new ArrayList<>((int)Math.pow(2,a));
	    char ch[]=new char[a];
	    Arrays.fill(ch,'0');
	    find(rs,ch,a,0,0);
	    System.out.println();
	    return rs;
	}
	void find(ArrayList<Integer> rs,char[] ch,int a,int start,int count)
	{
	    String s=new String(ch);
	    if(s.length()>0)
	        rs.add(Integer.parseInt(s,2)); 
	        System.out.print(s+" "+start+" "+count);
	    for(int i=a-1;i>=start;i--)
	    {
	       if(ch[i]=='0')
	       {
	           ch[i]='1';
	           System.out.print("  first\n");
	           find(rs,ch,a,i+1,count+1);
	           //ch[i]='0';
	       }
	       else if(ch[i]=='1')
	       {
	           ch[i]='0';
	           System.out.print("  second\n");
	           find(rs,ch,a,i+1,count+1);
	           //ch[i]='1';
	       }
	   }
	}
	
}
