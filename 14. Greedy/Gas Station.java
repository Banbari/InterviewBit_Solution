public class Solution {
	public int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
	    int start=0,total=0,tank=0;
        
        for(int i=0;i<gas.size();i++)
        {
            if((tank=tank+gas.get(i)-cost.get(i))<0)
            {
                start=i+1;
                total+=tank;
                tank=0;
            }
        }
        return (total+tank<0)? -1:start;
	}
}
