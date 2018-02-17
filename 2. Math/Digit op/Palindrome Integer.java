public class Solution {
	public boolean isPalindrome(int a) {
	    char ch[]=new Integer(a).toString().toCharArray();
	    for(int i=0;i<ch.length/2;i++)
	    {
	        if(ch[i]!=ch[ch.length-i-1])
	        return false;
	    }
	    return true;
	}
}
