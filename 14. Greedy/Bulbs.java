public class Solution {
    public int bulbs(ArrayList<Integer> a) {
        int count=0;
        boolean b[]=new boolean[a.size()];
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).intValue()==1)
            b[i]=true;
        }
        for(int i=0;i<b.length;i++)
        {
            if(!b[i])
            {
                count++;
                change(b,i+1);
            }
        }
        return count;
    }
    void change(boolean b[],int i)
    {
        for(;i<b.length;i++)
        b[i]=!b[i];
    }
}
