public class Solution {
	public String convert(String a, int b) {
	    if(b==1)
	    return a;
	    ArrayList<StringBuilder> ar=new ArrayList<>();
	    for(int i=0;i<b;i++)
	    ar.add(new StringBuilder(""));
	    int n=a.length();
	    int count=0;
	    boolean fl=false;
	    for(int i=0;i<n;i++)
	    {
	        ar.get(count).append(a.charAt(i));
	        if(count==b-1)
	        fl=true;
	        else if(count==0)
	        fl=false;
	        if(fl)
	        count--;
	        else if(!fl)
	        count++;
	    }
	    String s="";
	    for(StringBuilder temp:ar)
	    s+=temp.toString();
	    return s;
	}
}
