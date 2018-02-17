public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int x=0;
	    for(int i=0;i<a.size();i++)
	    x=x^a.get(i);
	    return x;
	}
}
