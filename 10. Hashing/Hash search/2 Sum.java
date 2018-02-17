public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    HashMap<Integer,Integer> hs=new HashMap<>();
	    for(int i=1;i<=a.size();i++)
	    {
	        int x=a.get(i-1).intValue();
	        if(hs.containsKey((b-x)))
	        {
	            int index1=Math.min(hs.get((b-x)).intValue(),i);
	            int index2=Math.max(hs.get((b-x)).intValue(),i);
	            ArrayList<Integer> rs=new ArrayList<>();
	            rs.add(index1);
	            rs.add(index2);
	            if(isLesser(ar,rs))
	            ar=rs;
	        }
	        else if(!hs.containsKey(x))
	        hs.put(x,i);
	    }
	    return ar;
	}
	public boolean isLesser(ArrayList<Integer> ar,ArrayList<Integer> rs)
	{
	    if(ar.isEmpty())
	    return true;
	    if(rs.get(1).intValue()<ar.get(1).intValue())
	    return true;
	    else if(rs.get(1).intValue()==ar.get(1).intValue() && rs.get(0).intValue()<ar.get(0).intValue())
	    return true;
	    return false;
	}
}
