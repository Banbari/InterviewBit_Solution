public class Solution {
	public int maxProfit(final List<Integer> a) {
	    int n=a.size();
	    if(n==0)
	    return 0;
	    int i=0,j=0;
	    int l[]=new int[n];
	    int r[]=new int[n];
	    l[0]=a.get(0);
	    r[n-1]=a.get(n-1);
	    for(i=1;i<n;i++)
	    l[i]=Math.min(l[i-1],a.get(i));
	    for(i=n-2;i>=0;i--)
	    {
	        r[i]=Math.max(r[i+1],a.get(i));
	    }
	    i=0;
	    j=0;
	    int max=Integer.MIN_VALUE;
	    for(i=0;i<n;i++)
	    max=Math.max(max,r[i]-l[i]);
	    return max>0?max:0;
	}
}
