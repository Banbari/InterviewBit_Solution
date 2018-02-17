public class Solution {
	public ArrayList<String> generateParenthesis(int a) {
	    ArrayList<String> rs=new ArrayList<>();
	    char ch[]=new char[2*a];
	    print(rs,2*a,0,ch);
	    return rs;
	}
	void print(ArrayList<String> rs,int n,int i,char[] ch)
	{
	    if(i==n)
		{
			int count1=0,count2=0;
			for(int j=0;j<n;j++)
			{
				if(ch[j]=='(')
			count1++;
			else if(ch[j]==')')
			count2++;
			if(count2>count1)
			return;
			}
		if(count1==count2)
		{
		rs.add(new String(ch));
		}
		return;
		}
		ch[i]='(';
		print(rs,n,i+1,ch);
		ch[i]=')';
		print(rs,n,i+1,ch);
	}
}
