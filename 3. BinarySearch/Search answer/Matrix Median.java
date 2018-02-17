public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int val=0;
        int k=(A.size()*A.get(0).size()/2)+1;
        for(int i=0;i<A.size();i++)
        {
            ArrayList<Integer> temp=A.get(i);
            int tt[]=new int[2];
            for(int j=0;j<temp.size();j++)
            {
                if(k==0)
                return val;
                else if(temp.get(j)<=val)
                k--;
                else if(temp.get(j)>val && k!=0)
                {
                    val=temp.get(j);
                    k--;
                }
                int thre=val;
                if(j<temp.size()-1)
                {
                    thre=temp.get(j+1);
                }
                tt=check(A,val,k,i+1,j,thre);
                
                val=tt[0];
                k=tt[1];
                //System.out.println(val+" "+k);
                
            }
        }
        return val;
    }
    int[] check(ArrayList<ArrayList<Integer>> A,int val,int k,int i,int j,int thre)
    {
        int temp[]=new int[2];
        for(;i<A.size();i++)
        {
            if(A.get(i).get(j)<=val)
            k--;
            else if(A.get(i).get(j)>val && k!=0 && A.get(i).get(j)<=thre)
                {
                    val=A.get(i).get(j);
                    k--;
                }
                if(k==0)
                {
                    temp[0]=val;
        temp[1]=k;
        return temp;
                }
        }
        
        temp[0]=val;
        temp[1]=k;
        return temp;
    }
}
