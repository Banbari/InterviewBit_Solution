public class Solution {
    public int mice(ArrayList<Integer> a, ArrayList<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        int max=0;
        for(int i=0;i<a.size();i++)
        max=Math.max(max,(int)Math.abs(a.get(i)-b.get(i)));
        return max;
    }
}
