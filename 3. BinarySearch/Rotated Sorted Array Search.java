public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    int pivot=0;
	    if(a.get(0)>a.get(a.size()-1))
	       pivot=findPivot(a,0,a.size()-1);
	   /*if(b==a.get(pivot))
	   return pivot;*/
	   int h=0,l=0,mid=0;
	   if(b>a.get(a.size()-1))
	   {
		   l=0;
		   h=pivot;
	   }
	   else
	   {
		   l=pivot;
		   h=a.size();
	   }
		  int low = l;
        int high = h-1;

        while (low <= high) {
             mid = (low + high) >>> 1;
            int midVal = a.get(mid);

            if (midVal < b )
                {
                    
                low = mid + 1;
                }
            else if (midVal > b)
                high = mid - 1;
            else
                return mid; 
        }
        return -( 1);
	}
	
	public int findPivot(List<Integer> a,int l,int h)
	{
	    while(l<=h)
		{
	    int mid=(h+l)/2;
	    if(a.get(mid)>a.get(mid+1))
	    return mid+1;
	    else if(a.get(mid)>a.get(h))
	    l=mid+1;
	    else
	    h=mid-1;
		}
		return 0;
	}
}