public class Solution {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
	    ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    int a[]=new int[k];
	    find(n,k,a,0,rs,1);
	    return rs;
	}
	void find(int n,int k,int[] a,int count,ArrayList<ArrayList<Integer>> rs,int start)
	{
	    if(count==k)
	    {
	        ArrayList<Integer> ar=new ArrayList<>();
	        for(int i:a)
	        ar.add(i);
	        rs.add(ar);
	        return;
	    }
	    for(int i=start;i<=n;i++)
	    {
	        a[count]=i;
	        start++;
	        find(n,k,a,count+1,rs,start);
	    }
	}
}
