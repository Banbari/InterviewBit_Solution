public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int x=0;
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    for(int i:a)
	    {
	        if(hm.containsKey(i))
	        {
	            hm.put(i,hm.get(i)+1);
	        }
	        else
	        hm.put(i,1);
	    }
	    Set<Map.Entry<Integer,Integer>> s=hm.entrySet();
	    java.util.Iterator<Map.Entry<Integer, Integer>> it=s.iterator();
	    
	    while(it.hasNext())
	    {
	    	Map.Entry<Integer,Integer> e=it.next();
	        if(e.getValue()<=2)
	        return e.getKey();
	    }
	    return x;
	}
}
