public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
	    int n=a.size();
	    if(n==1)
	    return 0;
	    for(int i=0;i<n;i++)
	    {
	        int l=a.indexOf(Math.abs(b+a.get(i).intValue()));
	        if(l==i)
	        l=a.lastIndexOf(Math.abs(b+a.get(i).intValue()));
	        if(l!=-1 && l!=i)
	        {
	            //System.out.println(i+" "+l);
	        return 1;
	        }
	    }
	    return 0;
	}
}
