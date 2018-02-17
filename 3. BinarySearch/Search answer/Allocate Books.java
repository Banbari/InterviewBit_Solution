public class Solution {
	public static int getMax(ArrayList<Integer> a) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            max = Math.max(a.get(i), max);
        }
        return max;
    }
    
    public static int getSum(ArrayList<Integer> a) {
        int total = 0;
        for(int i = 0; i < a.size(); i++) {
            total += a.get(i);
        }
        return total;
    }        
    
    public static int getRequiredReaders(ArrayList<Integer> a, int maxLengthPerReader) {
        int total = 0;
        int readers = 1;
        for(int i = 0; i < a.size(); i++) {
            total += a.get(i);
            if(total > maxLengthPerReader) {
                total = a.get(i);
                readers++;
            }
        }
        return readers;
    }
    
    public static int books(ArrayList<Integer> a, int b) {
        int lo = getMax(a);
        int hi = getSum(a);
        if(a.size() < b)
        return -1;
        while(lo < hi) {
            int mid = (int)(lo + (hi-lo)/2);
            //System.out.println("For Mid = " + mid +" \n lo = " + lo + "\n hi = " +  hi);
            int requiredReaders = getRequiredReaders(a, mid);
            if(requiredReaders <= b) {
                hi = mid;
                //System.out.println("\t hi = " + hi);
            }
            else {
                lo = mid + 1;                
                //System.out.println("\t lo = " + lo);
            }
        }
        return lo;
    }
}
