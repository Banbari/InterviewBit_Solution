public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect( List<Integer> a,  List<Integer> b) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    
	    /*if(a.size()<b.size())
	    {
	        List<Integer> temp=a;
	        a=b;
	        b=temp;
	    }*/
	    int m=a.size(),n=b.size();
	        int j=0,i=0;
	      while(i<m && j<n) 
	      {
	            if (a.get(i).intValue() < b.get(j).intValue())
	                i++;
	            else if (b.get(j).intValue() < a.get(i).intValue())
	                j++;
	            else /* if arr1[i] == arr2[j] */
	                {
	                    ar.add(b.get(j++).intValue());
	                    i++;
	                   // System.out.print(ar.get(ar.size()-1)+" ");
	                   }
	      }
	      //System.out.print("--");
	      
	    return ar;
	}
}
