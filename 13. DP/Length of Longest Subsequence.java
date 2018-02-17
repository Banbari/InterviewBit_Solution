public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        int n=A.size();
        int inc[]=new int[n];
        int dec[]=new int[n];
        for(int i=0;i<n;i++)
        inc[i]=dec[i]=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A.get(j)<A.get(i) && inc[i]<inc[j]+1)
                inc[i]=inc[j]+1;
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=n-1;j>i;j--)
            {
                if(A.get(j)<A.get(i) && dec[i]<dec[j]+1)
                dec[i]=dec[j]+1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        max=Math.max(max,inc[i]+dec[i]-1);
        return max;
    }
}
