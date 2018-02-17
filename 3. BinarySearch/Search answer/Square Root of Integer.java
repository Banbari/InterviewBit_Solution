public class Solution {
	public int sqrt(int a) {
	    if(a<2)
	    return a;
	    
	    long l=2l,h=(a+0l)/2l;
	    return (int)sq(a+0l,l,h);
	}
	public long sq(long a,long l,long h)
	{
	    while(l<=h)
	    {
	    long mid=(l+h)/2;
	    long mid1=mid*mid;
	    long mid2=(mid+1)*(mid+1);
	    if(mid1==a || (a>mid1 && a<mid2))
	    return mid;
	    else if(mid1>a)
	    h=mid-1l;
	    else if(mid1<a)
	    l=mid+1l;
	    }
	    return 1l;
	}
}
