public class Solution {
	public int canJump(ArrayList<Integer> a) {
	    int i=0,n=a.size();
	    int k=0;
    for(i=0;i<n && i<=k;i++)
    {
        k=Math.max(k,i+a.get(i));
    }
    return i==n?1:0;
	}
	/*public int canJump(ArrayList<Integer> a) {
	    int i=0,n=a.size();
    for (int reach = 0; i<n && i<=reach; ++i)
        reach = Math.max(i+a.get(i),reach);
    return i==n?1:0;
	}*/
}