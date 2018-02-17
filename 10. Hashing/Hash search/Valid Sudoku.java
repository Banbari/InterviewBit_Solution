public class Solution {
	public int isValidSudoku(final List<String> a) {
	    String s1[]=new String[a.size()];
	    a.toArray(s1);
	    HashSet<Character> row=new HashSet<>();
	    for(int j=0;j<s1.length;j++)
	    {
	        for(int i=0;i<s1[j].length();i++)
	        {
	            char ch=s1[j].charAt(i);
	            if(ch!='.' && row.contains(ch))
	            return 0;
	            row.add(ch);
	        }
	        row.clear();
	    }
	    for(int i=0;i<s1[0].length();i++)
	    {
	    for(int j=0;j<s1.length;j++)
	    {
	            char ch=s1[j].charAt(i);
	            if(ch!='.' && row.contains(ch))
	            return 0;
	            row.add(ch);
	        }
	        row.clear();
	    }
	    for(int i=0;i<9;i+=3)
	    {
	        for(int j=0;j<9;j+=3)
	        if(check(s1,i,j))
	        return 0;
	    }
	    return 1;
	}
	public boolean check(String s[],int row,int col)
	{
	    HashSet<Character> hs=new HashSet<>();
	    for(int i=row;i<row+3;i++)
	    for(int j=col;j<col+3;j++)
	    {
	        char ch=s[i].charAt(j);
	        if(ch!='.' && hs.contains(ch))
	        return true;
	        hs.add(ch);
	    }
	    return false;
	}
}
