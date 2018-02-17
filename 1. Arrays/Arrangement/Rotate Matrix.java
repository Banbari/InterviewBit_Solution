public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    int m=a.size();
	    int rs[][]=new int[m][m];
	    for(int i=0;i<m/2;i++)
	    {
	        for(int j=i;j<m-i-1;j++)
	        {
	            int temp1=a.get(m-j-1).get(i).intValue();
	            int temp2=a.get(m-i-1).get(m-j-1).intValue();
	            int temp3=a.get(j).get(m-i-1).intValue();
	            int temp4=a.get(i).get(j).intValue();
	            a.get(i).set(j,temp1);
	            a.get(m-j-1).set(i,temp2);
	            a.get(m-i-1).set(m-j-1,temp3);
	            a.get(j).set(m-i-1,temp4);
	        }
	    }
	    /*for(int i=0;i<m;i++)
	    for(int j=0;j<m;j++)
	    {
	        rs[m-j-1][m-i-1]=a.get(i).get(j).intValue();
	    }*/
	    /*for(int i=0;i<m;i++)
	    for(int j=0;j<m;j++)
	    {
	        a.get(i).set(j,rs[m-i-1][j]);
	    }*/
	}
}
