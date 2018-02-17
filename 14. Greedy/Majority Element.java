public class Solution {
	public int majorityElement(final List<Integer> a) {
	    if(a.size()==1)
	    return a.get(0);
	    int count=0;
	    int ele=0;
	    for(int i=0;i<a.size();i++)
	    {
	        int x=a.get(i).intValue();
	        if(x==ele)
	        count++;
	        else if(count==0)
	        {
	            count=1;
	            ele=x;
	        }
	        else
	        count--;
	    }
	    /*count=0;
	    for(Integer i:a)
	    {
	        if(i.intValue()==ele)
	        count++;
	    }
	    if(count>a.size()/2)*/
	    return ele;
	    //else
	    //return -1;
	}
}