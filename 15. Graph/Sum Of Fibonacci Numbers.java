public class Solution {
    ArrayList<Integer> ar;
	public int fibsum(int a) {
	    if(ar==null)
	    {
	    ar=new ArrayList<>();
	    ar.add(1);
	    ar.add(1);
	    int x=1,y=1,z=0;
	    while(z<a)
	    {
	        z=x+y;
	        ar.add(z);
	        x=y;
	        y=z;
	    }
	    }
	    int count=0;
	    int tempn=a;
	    int in=ar.size()-1;
	    while(tempn>0)
	    {
	        int num=ar.get(in);
	        if(num<=tempn)
	        {
	            count+=tempn/num;
	            tempn%=num;
	        }
	        in--;
	    }
	    return count;
	}
}
