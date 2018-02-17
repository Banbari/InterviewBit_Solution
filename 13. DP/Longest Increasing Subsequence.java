public class Solution {
	public int lis(final List<Integer> a) {
	    int s[]=new int[a.size()];
	    for(int i=0;i<s.length;i++)
	    s[i]=1;
	    for(int i=1;i<s.length;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(a.get(i)>a.get(j))
	            s[i]=Math.max(s[i],s[j]+1);
	        }
	    }
	    int max=0;
	    for(int i=0;i<s.length;i++)
	    max=Math.max(max,s[i]);
	    return max;
	}
}
