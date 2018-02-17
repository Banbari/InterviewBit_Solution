public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int m=a.size(),n=b.size();
	    int i=0,j=0;
	    while(i<m && j<n)
	    {
	        if(a.get(i).intValue()>b.get(j).intValue())
	        {
	            a.add(i,b.get(j++));
	            m++;
	        }
	        else
	        i++;
	        
	    }
	    //while(i<m)
	     
	    while(j<n)
	    {
	        a.add(b.get(j++));
	    }
	}
}
