public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        int a[]=new int[A.size()];
        for(int i=0;i<a.length;i++)
        a[i]=A.get(i);
        Arrays.sort(a);
        return lap(a);
    }
    int lap(int a[])
    {
        int len=0;
        int n=a.length;
        if(n<=2)
        return n;
        int i=0,k=0,j=0;
        int dp[][]=new int[n][n];
        for(i=0;i<n;i++)
        dp[i][n-1]=2;
        for(j=n-2;j>=1;j--)
        {
            i=j-1;
            k=j+1;
            while(i>=0 && k<=n-1)
            {
                if(a[i]+a[k]>2*a[j])
                {
                    dp[i][j]=2;
                    i--;
                }
                else if(a[i]+a[k]<2*a[j])
                k++;
                else
                {
                    dp[i][j]=dp[j][k]+1;
                    len=Math.max(len,dp[i][j]);
                    i--;
                    k++;
                }
            }
            while(i>=0)
            {
                dp[i][j]=2;
            i--;
            }
        }
        return len;
    }
}
