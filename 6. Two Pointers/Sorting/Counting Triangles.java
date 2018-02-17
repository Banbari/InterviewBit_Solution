public class Solution {
    public int nTriang(ArrayList<Integer> A) {
        int n=A.size();
        Collections.sort(A);
        int count=0;
        for(int i=0;i<n-2;++i)
        {
            int k=i+2;
            for (int j=i+1;j<n;++j)
            {
                while(k<n && A.get(i).intValue()+A.get(j).intValue()>A.get(k).intValue())
                    ++k;
                count=(count+(k-j-1))%1000000007;
            }
        }
        return count%1000000007;
    }
}
