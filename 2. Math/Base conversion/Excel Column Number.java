public class Solution {
	public int titleToNumber(String a) {
	    int count=0;
	    a=a.toUpperCase();
	    int j=0;
	    for(int i=a.length()-1;i>=0;i--)
	    {
	        count+=Math.pow(26,(j++))*(a.charAt(i)-64);
	    }
	    return count;
	}
}