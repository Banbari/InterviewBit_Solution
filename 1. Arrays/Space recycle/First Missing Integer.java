public class Solution {
	public int firstMissingPositive(ArrayList<Integer> a) {
	    //TreeSet<Integer> ar=new TreeSet();
	    Collections.sort(a);
	    int n=a.size();
	    /*for(int i=0;i<n;i++)
	    {
	        int temp=a.get(i).intValue();
	        if(temp>0)
	        ar.add(temp);
	    }*/
	    int k=1;
	    int in=find(a);
	    if(in==n)
	    return 1;
	    
	    for(int i=in;i<n;i++)
	    {
	        int x=a.get(i).intValue();
	        if(x!=k)
	        return k;
	        k++;
	    }
	    return k;
	}
	public int find(ArrayList<Integer> ar)
	{
	    int n=ar.size();
	    for(int i=0;i<n;i++)
	    {
	        if(ar.get(i).intValue()>0)
	        return i;
	    }
	    return n;
	}
}
