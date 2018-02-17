public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	   if(a.size()<=1)
	    return a.size();
	    int index=1;
	    for(int i=1;i<a.size();i++)
	    {
	        if(a.get(i).intValue()==a.get(i-1).intValue()) {continue;}
	        a.set(index++,a.get(i));
	    }
	   return index;
	}
}
