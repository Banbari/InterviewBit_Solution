public class Solution {
        private final int mod=1000000007;
    public int nchoc(int A, ArrayList<Integer> B) {
            PriorityQueue<Integer> pq=new PriorityQueue<>((x, y) -> y - x);
        for(int i=0;i<B.size();i++)
        pq.add(B.get(i));
        int count=0;
        for(int i=0;i<A;i++)
        {
            int data=pq.poll();
            count=(count+(data%mod))%mod;
            pq.add(data/2);
        }
        return count;
    }
}
