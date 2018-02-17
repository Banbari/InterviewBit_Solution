public class Solution {
    public int findMinXor(ArrayList<Integer> ar) {
        int min=Integer.MAX_VALUE;
        Collections.sort(ar);
        for(int i=0;i<ar.size()-1;i++)
        if((ar.get(i).intValue()^ar.get(i+1).intValue())<min)
        min=ar.get(i).intValue()^ar.get(i+1).intValue();
    return min;
        
    }
}
