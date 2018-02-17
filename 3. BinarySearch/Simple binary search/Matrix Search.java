public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    int l=0,h=a.size();
	    int in=0;
	    for(int i=0;i<h;i++)
	    {
	        if(b>=a.get(i).get(0) && b<=a.get(i).get(a.get(i).size()-1))
	        {
	            in=i;
	            break;
	        }
	    }
	    h=a.get(in).size()-1;
	    while(l<=h)
	    {
	        int mid=(l+h)/2;
	        if(a.get(in).get(mid)==b)
	        return 1;
	        else if(b>a.get(in).get(mid))
	        l=mid+1;
	        else
	        h=mid-1;
	    }
	    return 0;
	}
}
