public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    //int count=0;
	    if(a.size()==0 || a.size()==1)
	    return a.size();
	    int count=1,in=0;
	    for(int i=1;i<a.size();i++)
	    {
	        if(a.get(i).intValue()==a.get(i-1).intValue())
	        count++;
	        else
	        count=1;
	        if(count<=2)
	        a.set(++in,a.get(i).intValue());
	    }
	    return in+1;
	}
}
