public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    Collections.sort(a);
	    for(int i=1;i<a.size();i+=2)
	    {
	       int temp=a.get(i);
	       a.set(i,a.get(i-1));
	       a.set(i-1,temp);
	    }
	    return a;
	}
}
