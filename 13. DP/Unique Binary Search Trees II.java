public class Solution {
	public int numTrees(int a) {
	    int ct[]=new int[a+1];
	    ct[0]=ct[1]=1;
	    for (int i=2; i<=a; i++)
        {
        ct[i] = 0;
        for (int j=0; j<i; j++)
            ct[i] += ct[j] * ct[i-j-1];
        }
     return ct[a];
	}
}
