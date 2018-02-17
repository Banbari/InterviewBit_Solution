public class Solution {
	public String reverseWords(String a) {
	    StringTokenizer st=new StringTokenizer(a," ");
	    ArrayList<String> ar=new ArrayList<>();
	    while(st.hasMoreTokens())
	    {
	        ar.add(st.nextToken());
	    }
	    StringBuffer s=new StringBuffer("");
	    for(int i=ar.size()-1;i>=0;i--)
	    {
	        s.append(ar.get(i));
	        if(i!=0)
	        s.append(" ");
	    }
	    return s.toString();
	}
}
