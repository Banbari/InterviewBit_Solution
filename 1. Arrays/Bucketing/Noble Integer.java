public class Solution {
    public int solve(ArrayList<Integer> A) {
        TreeSet<Integer> tr=new TreeSet<>();
        int n=A.size();
        int count=0;
        //for(int i=0;i<n;i++)
        //tr.add(A.get(i).intValue());
        //n=tr.size();
        Collections.sort(A);
        Iterator it=A.iterator();
        for(int i=0;i<n;i++)
        {
            
            int temp=A.get(i).intValue();
            if(temp==(n-count-1))
            {
                if(i<n-1 && A.get(i+1)!=temp)
                {
                    //System.out.println();
                return 1;
                }
                else if(i==n-1)
                return 1;
            }
            count++;
        }
        {
            //System.out.println();
                return -1;
            }
    }
}
