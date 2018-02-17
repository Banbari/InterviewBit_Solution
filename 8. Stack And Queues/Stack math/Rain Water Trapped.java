public class Solution {
	// DO NOT MODIFY THE LIST
	public int trap(final List<Integer> a) {
	    int n=a.size();
	    int left[]=new int[n];
	    int right[]=new int[n];
	    left[0]=-1;
	    right[n-1]=-1;
	    for(int i=1;i<n;i++)
	    {
	        left[i]=Math.max(Math.max(left[i-1],a.get(i-1)),a.get(i).intValue());
	    }
	    
	    for(int i=n-2;i>=0;i--)
	    {
	        right[i]=Math.max(Math.max(a.get(i+1),right[i+1]),a.get(i).intValue());
	    }
	    int sum=0;
	    for(int i=0;i<n;i++)
	    {
	        int curr=Math.min(left[i],right[i])-a.get(i).intValue();
	        sum+=curr>0?curr:0;
	    }
	    return sum;
	}
}
