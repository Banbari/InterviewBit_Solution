public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> ar) {
	    boolean row[]=new boolean[ar.size()];
	    boolean column[]=new boolean[ar.get(0).size()];
	   for(int i=0;i<ar.size();i++)
	    {
	        for(int j=0;j<ar.get(i).size();j++)
	        {
	            if(ar.get(i).get(j)==0)
	            {
	                row[i]=true;
	                column[j]=true;
	            }
	        }
	    }
	    for(int i=0;i<row.length;i++)
	    {
	        if(row[i])
	        {
	            for(int j=0;j<column.length;j++)
	            {
	                ar.get(i).set(j,0);
	            }
	            row[i]=false;
	        }
	    }
	    for(int i=0;i<column.length;i++)
	    {
	        if(column[i])
	        {
	            for(int j=0;j<row.length;j++)
	            {
	                ar.get(j).set(i,0);
	            }
	            column[i]=false;
	        }
	    }
	}
}
