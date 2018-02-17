public class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> ar) {
	    int n=ar.size();
	    /*int a[][]=new int[n][n];
	    for(ArrayList<Integer> temp:ar)
	    System.out.println(temp);*/
	    for(int i=n-1;i>0;i--)
	    {
	        for(int j=0;j<i;j++)
	        {
	            int x=ar.get(i).get(j);
	            int y=ar.get(i).get(j+1);
	            int z=ar.get(i-1).get(j);
	            ar.get(i-1).set(j,z+Math.min(x,y));
	        }
	    }
	    /*for(ArrayList<Integer> temp:ar)
	    System.out.println(temp);*/
	    return ar.get(0).get(0);
	}
}
