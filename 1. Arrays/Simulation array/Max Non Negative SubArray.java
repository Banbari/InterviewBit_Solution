public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    ArrayList<Integer> ar=new ArrayList<Integer>();
                int start1=0,end1=0,start2=0,end2=0;
                long sum=-1,curr_sum=0;
	    int l=a.size();
	    for(int i=0;i<l;i++)
	    {
	        int temp=a.get(i);
	        curr_sum+=(0L+temp);
	        end2=i;
	        if(curr_sum>sum)
	        {
	            start1=start2;
	            end1=end2;
                    sum=curr_sum;
                }
                else if(curr_sum==sum && ((end2-start2)>(end1-start1)))
                {
                   start1=start2;
	            end1=end2; 
                }
	        if(temp<0 && i+1<=l-1)
	        {
	            start2=i+1;
	            curr_sum=0;
	        }
	    }
            if(sum>=0)
            for(int i=start1;i<=end1;i++)
                ar.add(a.get(i));
	    return ar;
	}
}
