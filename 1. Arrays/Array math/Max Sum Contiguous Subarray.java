public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int max=Integer.MIN_VALUE;
	    int curr=0;
	    for(int i=0;i<a.size();i++)
	    {
	        curr+=a.get(i);
	        if(max<curr) max=curr;
	        if(curr<0) curr=0;
	    }
	    return max;
	}
}
