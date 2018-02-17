public class Solution {
	public int trailingZeroes(int a) {
	    int count=0;
	        while(a>0)
	        {
	          count+=a/5;
	          a/=5;
	        }
	        return count;
	}
}
