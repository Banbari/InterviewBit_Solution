public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
	    find(ar,a,new ArrayList<Integer>());
	    return ar;
	}
	
	public void find(ArrayList<ArrayList<Integer>> rs,ArrayList<Integer> a,ArrayList<Integer> temp)
	{
	    if(temp.size()==a.size())
	    {
	        rs.add(new ArrayList<Integer>(temp));
	        return;
	    }
	    for(int i=0;i<a.size();i++)
	    {
	        if(temp.contains(a.get(i).intValue()))
	        continue;
	        temp.add(a.get(i));
	        find(rs,a,temp);
	        temp.remove(temp.size()-1);
	    }
	}
}
