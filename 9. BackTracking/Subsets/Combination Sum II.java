public class Solution {
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
	ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    Collections.sort(a);
	    find(rs,a,b,0,new ArrayList<Integer>(),0);
	    return rs;
	}
	public void find(ArrayList<ArrayList<Integer>> rs,ArrayList<Integer> a
	,int b,int sum,ArrayList<Integer> temp,int start)
	{
	    if(sum==b)
	    {
	        rs.add(new ArrayList<Integer>(temp));
	        return;
	    }
	    if(sum>b)
	    return;
	   
	   for(int i=start;i<a.size();i++)
	    {
	        if(i>start && a.get(i).intValue()==a.get(i-1).intValue())
	        continue;
	        sum=sum+a.get(i).intValue();
	        temp.add(a.get(i).intValue());
	        find(rs,a,b,sum,temp,i+1);
	        temp.remove(temp.size()-1);
	        sum=sum-a.get(i).intValue();
	    }
	}
}
