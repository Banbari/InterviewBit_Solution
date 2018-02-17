public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    if(a.size()==0 || b<=a.get(0))
	    return 0;
	    else if(b>a.get(a.size()-1))
	    return a.size();
	    return find(a,0,a.size()-1,b);
	}
	
	public int find(ArrayList<Integer> a,int l,int h,int b)
	{
	    while(l<=h)
	    {
	        int mid=(l+h) >>> 1;
	        int ele=a.get(mid);
	        if(ele==b || ( mid>0 &&a.get(mid-1)<b && a.get(mid)>b))
	        return mid;
	        else if(b>ele)
	        l=mid+1;
	        else if(b<ele)
	        h=mid-1;
	    }
	    return -1;
	}
}
