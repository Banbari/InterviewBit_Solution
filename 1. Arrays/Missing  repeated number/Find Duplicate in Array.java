public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	   //HashSet<Integer> hs=new HashSet(a.size());
	   Collections.sort(a);
	    for(int i=0;i<a.size()-1;i++)
	    {
	        
	        if (a.get(i).intValue()==a.get(i+1).intValue()) return a.get(i);
	    }
	    return -1;
	}
}
