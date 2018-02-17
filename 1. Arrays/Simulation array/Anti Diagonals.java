public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
	    int j=0,k=0,l=A.size();
	    ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
	    for(int i=0;i<2*l-1;i++)
	    ar.add(new ArrayList<>());
	    for(int i=0;i<l;i++)
	    {
	        int count=i-0;
	        j=i;
	        k=0;
	        while(count-->=0)
	        {
	            ar.get(i).add(A.get(k++).get(j--));
	        }
	    }
	    for(int i=1;i<l;i++)
	    {
	        int count=l-i;
	        j=l-1;
	        k=i;
	        while(count-->0)
	        {
	            ar.get(l+i-1).add(A.get(k++).get(j--));
	        }
	    }
	    return ar;
	}
}
