public class Solution {
	public int lengthOfLastWord(final String b) {
	    String a=b.toString();
	    a=a.trim();
	    int n=a.lastIndexOf(" ");
	    int count=0;
	    if(n==-1) return a.length();
	    for(int i=n+1;i<a.length();i++)
	    count++;
	    return count;
	}
}
