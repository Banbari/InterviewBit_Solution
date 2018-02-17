public class Solution {
	public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
	    int n=a.size();
	    int m=a.get(0).size();
	    int rs[][]=new int[n][m];
	    boolean fl=false;
	    for(int i=0;i<n;i++)
	    {
	        int temp=a.get(i).get(0);
	        if(temp==1 && !fl)
	        fl=true;
	        if(fl)
	        rs[i][0]=0;
	        else
	        rs[i][0]=1;
	    }
	    fl=false;
	    for(int i=0;i<m;i++)
	    {
	        int temp=a.get(0).get(i);
	        if(temp==1 && !fl)
	        fl=true;
	        if(fl)
	        rs[0][i]=0;
	        else
	        rs[0][i]=1;
	    }
	    for(int i=1;i<n;i++)
	    {
	        for(int j=1;j<m;j++)
	        {
	            if(rs[i-1][j]!=0 && rs[i][j-1]!=0 && a.get(i).get(j).intValue()!=1)
	            rs[i][j]=rs[i-1][j]+rs[i][j-1];
	            else if(a.get(i).get(j).intValue()!=1)
	            rs[i][j]=Math.max(rs[i-1][j],rs[i][j-1]);
	            else
	            rs[i][j]=0;
	        }
	    }
	    return rs[n-1][m-1];
	}
}
