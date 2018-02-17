public class Solution {
	public int isPalindrome(String a) {
	    a=a.toUpperCase();
	    StringBuffer s=new StringBuffer("");
	    char ch=' ';
	    for(int i=0;i<a.length();i++)
	    {
	        ch=a.charAt(i);
	        if((ch>=65 && ch<=90) || (ch>=48 && ch<=57))
	        s.append(a.charAt(i));
	    }
	    for(int i=0;i<s.length()/2;i++)
	    if(s.charAt(i)!=s.charAt(s.length()-1-i))
	    return 0;
	    return 1;
	}
}
