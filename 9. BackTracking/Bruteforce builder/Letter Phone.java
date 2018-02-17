public class Solution {
	public ArrayList<String> letterCombinations(String a) {
	    String[] s={
	        "0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
	    };
	    ArrayList<String> rs=new ArrayList<>();
	    char ch[]=new char[a.length()];
	    find(a,s,rs,ch,0);
	    //System.out.println(rs);
	    return rs;
	}
	public void find(String s,String [] s1,ArrayList<String> rs,char ch[],int count)
	{
	    if(count==s.length())
	    {
	        rs.add(new String(ch));
	        return;
	    }
	    if(count<s.length())
	    {
	    for(int i=0;i<s1[s.charAt(count)-'0'].length();i++)
	    {
	        ch[count]=s1[s.charAt(count)-'0'].charAt(i);
	        find(s,s1,rs,ch,count+1);
	    }
	    }
	}
}
