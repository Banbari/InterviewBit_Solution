public class Solution {
	public int threeSumClosest(ArrayList<Integer> a, int b) {
	    int sum=Integer.MAX_VALUE;
	    int min=b;
	    if(a.size()<3)
	    return 0;
	    Collections.sort(a);
	    //System.out.println(a);
	    for(int i=0;i<a.size();i++)
	    {
	        sum=a.get(i);
	        int j=i+1,k=a.size()-1;
	        while(j<k)
	        {
	            int sum1=sum+a.get(j)+a.get(k);
	            if(sum1==b)
	            return sum1;
	            else {
	                if(min==b || Math.abs(sum1-b)<Math.abs(min-b))
	                    min=sum1;
	                if(sum1<b)
	                {
	                    while(j<k && a.get(j)==a.get(j+1))
	                    j++;
	                    j++;
	                }
	                else
	                {
	                    while(j<k && a.get(k)==a.get(k-1))
	                    k--;
	                    k--;
	                }
	                
	            }
	                
	        }
	    }
	    return min;
	}
}
