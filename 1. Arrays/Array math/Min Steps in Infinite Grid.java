public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
       
         int count=0;
        for(int i=0;i<x.size()-1;i++)
        {
            int x1=x.get(i);
            int y1=y.get(i);
            int x2=x.get(i+1);
            int y2=y.get(i+1);
            int diff1=Math.abs(x1-x2);
            int diff2=Math.abs(y1-y2);
            if(diff1>diff2) count+=diff1;
            else count+=diff2;
        }
        return count;
    }
}