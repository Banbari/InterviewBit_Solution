public class Solution {
	public void solveSudoku(ArrayList<ArrayList<Character>> a) {
	    solve(a,0,0);
	}
	public boolean solve(ArrayList<ArrayList<Character>> a,int i,int j)
	{
	    if(i==a.size())
	    {
	        i=0;
	        if(++j==a.get(0).size())
	        return true;
	    }
	    if(a.get(i).get(j)!='.')
	    return solve(a,i+1,j);
	    for(int x=1;x<=a.size();x++)
	    {
	        char ch=(char)(x+48);
	        if(isValid(a,i,j,ch))
	        {
	            a.get(i).set(j,ch);
	            if(solve(a,i+1,j))
	            return true;
	        }
	    }
	    a.get(i).set(j,'.');
	    return false;
	}
	public boolean isValid(ArrayList<ArrayList<Character>> a,int i,int j,char ch)
	{
	    for(int k=0;k<a.size();k++)
	    if(a.get(i).get(k)==ch)
	    return false;
	    
	    for(int k=0;k<a.get(0).size();k++)
	    if(a.get(k).get(j)==ch)
	    return false;
	    
	    int row=i-(i%3);
	    int col=j-(j%3);
	    for(int x=row;x<row+3;x++)
	    for(int y=col;y<col+3;y++)
	    if(a.get(x).get(y)==ch)
	    return false;
	    
	    return true;
	}
}
