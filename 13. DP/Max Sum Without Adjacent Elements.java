public class Solution {
	public int adjacent(ArrayList<ArrayList<Integer>> a) {
	    int n=a.get(0).size();
	    int s[][]=new int[n+1][2];
	    s[0][1]=Math.max(a.get(0).get(0),a.get(1).get(0));
	    for(int j=1;j<n;j++)
	    {
	        int ele=Math.max(a.get(0).get(j),a.get(1).get(j));
	        s[j][0]=Math.max(s[j-1][0],s[j-1][1]);
	        s[j][1]=ele+s[j-1][0];
	    }
	    return Math.max(s[n-1][0],s[n-1][1]);
	}
}
