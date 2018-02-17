public class Solution {
    int sum=0;
	public int uniquePaths(int a, int b) {
	    call(a,b);
	    return sum;
	}
	public void call(int a,int b)
	{
	    if(a==1 || b==1)
	    {
	    sum++;
	    return;
	    }
	    call(a,b-1);
	    call(a-1,b);
	    //call(a-2,b-1);
	}
}
