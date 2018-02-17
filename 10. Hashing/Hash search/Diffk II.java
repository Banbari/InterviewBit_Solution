public class Solution {
	public int diffPossible(final List<Integer> a, int b) {
	    HashSet<Integer> hs=new HashSet<>();
	    for(int i=0;i<a.size();i++)
	    {
	        if(hs.contains(a.get(i).intValue()+b) || hs.contains(a.get(i).intValue()-b))
	        return 1;
	        hs.add(a.get(i).intValue());
	    }
	    return 0;
	}
}
