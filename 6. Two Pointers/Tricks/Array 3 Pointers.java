public class Solution {
	// DO NOT MODIFY THE LISTS
	public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) /*{
	    int n1=a.size(),n2=b.size(),n3=c.size();
	    int i=0,j=0,k=0;
	    int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    while(i<n1 && j<n2 && k<n3)
	    {
	        int x=a.get(i).intValue();
	        int y=b.get(j).intValue();
	        int z=c.get(k).intValue();
	        max=Math.max(x,Math.max(y,z))-Math.min(x,Math.min(y,z));
	        min=Math.min(min,max);
	        if(min==0)
	        break;
	        if(x<y && x<z)
	        i++;
	        else if(y<x && y<z)
	        j++;
	        else
	        k++;
	    }
	    return min;
	}*/
	
	{
        int diff = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i, j, k;
        for(i = 0, j = 0, k = 0; i < a.size() && j < b.size() && k < c.size();){
            min = Math.min(a.get(i), Math.min(b.get(j), c.get(k)));
            max = Math.max(a.get(i), Math.max(b.get(j), c.get(k)));
            diff = Math.min(diff, max - min);
            if(diff == 0)
                break;
            if(a.get(i) == min)
                i++;
            else if(b.get(j) == min)
                j++;
            else
                k++;
        }
        return diff;
        
            
    }
	
}
