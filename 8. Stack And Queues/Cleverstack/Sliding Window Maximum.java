public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
	    int n=a.size();
	    ArrayList<Integer> rs=new ArrayList<>();
	    TreeMap<Integer,Integer> tr=new TreeMap<>();
	    for(int i=0;i<b;i++)
	    {
	        int x=a.get(i);
	        if(tr.containsKey(x))
	        tr.put(x,tr.get(x)+1);
	        else
	        tr.put(x,1);
	    }
	    for(int i=b;i<n;i++)
	    {
	        Map.Entry<Integer,Integer> temp=tr.pollLastEntry();
	        int key=(Integer) (temp.getKey());
	        int val=(Integer)(temp.getValue());
	        rs.add(key);
	        int out=a.get(i-b);
	        if(out==key)
	        {
	            if(val!=1)
	                tr.put(key,val-1);
	        }
	        else
	        {
	            tr.put(key,val);
	            Integer val1=tr.get(out);
	            if(val1>1)
	            tr.put(out,val1-1);
	            else
	            tr.remove(out);
	        }
	        int x=a.get(i);
	        if(tr.containsKey(x))
	        tr.put(x,tr.get(x)+1);
	        else
	        tr.put(x,1);
	    }
	    Map.Entry<Integer,Integer> temp=tr.pollLastEntry();
	        int key=(Integer) (temp.getKey());
	        int val=(Integer)(temp.getValue());
	    rs.add(key);
	    return rs;
	}
}
