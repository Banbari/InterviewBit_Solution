public class Solution {
	public int minPathSum(ArrayList<ArrayList<Integer>> a) {
	    int n=a.size();
	    int m=a.get(0).size();
	    int dp[][]=new int[n][m];
	    int sum=0;
	    for(int i=0;i<m;i++)
	    {
	        dp[0][i]=a.get(0).get(i)+sum;
	        sum+=a.get(0).get(i);
	    }
	    sum=0;
	    for(int i=0;i<n;i++)
	    {
	    dp[i][0]=a.get(i).get(0)+sum;
	    sum+=a.get(i).get(0);
	    }
	    for(int i=1;i<n;i++)
	    for(int j=1;j<m;j++)
	    dp[i][j]=a.get(i).get(j)+Math.min(dp[i-1][j],dp[i][j-1]);
	    //System.out.println(Arrays.deepToString(dp));
	    return dp[n-1][m-1];
	}
}
