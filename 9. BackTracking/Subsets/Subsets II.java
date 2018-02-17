public class Solution {
	public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    Collections.sort(a);
	    find(rs,a,new ArrayList<Integer>(),0);
	    return rs;
	}
	public static void find(ArrayList<ArrayList<Integer>> rs,ArrayList<Integer> a,ArrayList<Integer> temp,int start)
	{
	    rs.add(new ArrayList(temp));
	    for(int i=start;i<a.size();i++)
	    {
	        if(i>start && a.get(i).intValue()==a.get(i-1).intValue())
	        continue;
	        temp.add(a.get(i).intValue());
	        find(rs,a,temp,i+1);
	        temp.remove(temp.size()-1);
	    }
	}
}
