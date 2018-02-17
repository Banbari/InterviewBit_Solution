public class Solution {
	public int lengthOfLongestSubstring(String a) {
	    /*HashMap<Character,Integer> ar=new HashMap<>();
	    int len=0;
	    int start=0,end=0;
	    int n=s.length();
	    for (int j=0;j<n;j++) {
            if (ar.containsKey(s.charAt(j))) {
                start=Math.max(ar.get(s.charAt(j)),start);
            }
            len = Math.max(len, j - start + 1);
            ar.put(s.charAt(j), j + 1);
        }
	    return len;*/
	     HashMap<Character,Integer> ar=new HashMap<>();
	    int len=0;
	    int start=0,end=0;
	    for(int i=0;i<a.length();i++)
	    {
	        char ch=a.charAt(i);
	        //int index=ar.containsKey(ch);
	        if(ar.containsKey(ch))
	        {
	            //ar=ar.subList(index+1,ar.size());
	            int index=(ar.get(ch));
	            start=Math.max(index,start);
	        }
	            ar.put(ch,i+1);
	            end++;
	        if(len<end-start)
	        len=end-start;
	    }
	    return len;
	}
}
