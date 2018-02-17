public class Solution {
    public int cntBits(ArrayList<Integer> a) {
       long count=0;
        
    for(int i=0;i<32;i++)
        {
            long x=0,y=0;
            for(int j=0;j<a.size();j++)
            {
                if(a.get(j)%2==0)
                x++;
                else
                y++;
                a.set(j,a.get(j)/2);
            }
            count+=(x*y);
        }
        return (int)((count*2)%1000000007);
    }
}
