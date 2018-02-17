public class Solution {
	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
	    Collections.sort(a);
	    //System.out.println(a);
	    ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    /*ArrayList<Integer> ar=new ArrayList<>();
	    for(int i=0;i<a.size()-1;i++)
	    {
	        ar.add(a.get(i).intValue()+a.get(i+1).intValue());
	    }*/
	    for(int k=0;k<a.size();k++)
	    {
	        if(k>0 && a.get(k).intValue()==a.get(k-1).intValue())
	        continue;
	        int i=k+1,j=a.size()-1;
	        while(i<j)
	        {
	            int sum=a.get(k).intValue()+a.get(i).intValue()+a.get(j).intValue();
	            if(sum<0)
	            i++;
	            else if(sum>0)
	            j--;
	            else
	            {
	               
	               ArrayList<Integer> temp=new ArrayList<>(3);
	                temp.add(a.get(k));
	                temp.add(a.get(i));
	                temp.add(a.get(j));
	                //Collections.sort(temp);
	                rs.add(temp);
	                int lvalue=a.get(i);
	               int rvalue=a.get(j);
	               while(i<j && a.get(i)==lvalue)
	               i++;
	               while(j>i && a.get(j)==rvalue)
	               j--;
	            }
	        }
	    }
	    /*for(int i=0;i<ar.size();i++)
	    {
	        for(int j=0;j<a.size();j++)
	        {
	            if(ar.get(i).intValue()+a.get(j).intValue()==0 && j!=i && j!=i+1)
	            {
	                ArrayList<Integer> temp=new ArrayList<>(3);
	                temp.add(a.get(i));
	                temp.add(a.get(i+1));
	                temp.add(a.get(j));
	                ar.remove(i);
	                i--;
	                Collections.sort(temp);
	                rs.add(temp);
	                break;
	            }
	        }
	    }*/
	    
	    return rs;
	}
}
