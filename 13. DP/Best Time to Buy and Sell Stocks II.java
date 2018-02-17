public class Solution {
	public int maxProfit(final List<Integer> a) {
	    int prof=0;
	    for(int i=0;i<a.size()-1;i++)
	    {
	        if(a.get(i).intValue()<a.get(i+1).intValue())
	        {
	            prof+=a.get(i+1).intValue()-a.get(i).intValue();
	        }
	    }
	    return prof;
	}
}