public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int minindex=-1,maxindex=-1,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int l=A.size();
        int un_l=-1,un_r=-1;
        int i=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for( i=1;i<l;i++)
        {
            if(A.get(i).intValue()<A.get(i-1).intValue())
            {
                un_l=i;
                break;
                
            }
        }
        for( i=l-2;i>=0;i--)
        {
            if(A.get(i).intValue()>A.get(i+1).intValue())
            {
                un_r=i;
                break;
            }
        }
        if(un_l==-1 || un_r==-1)
        {
            ar.add(-1);
            return ar;
        }
        for( i=un_l-1;i<=un_r;i++)
        {
            int temp=A.get(i).intValue();
            if(temp>max) max=temp;
            if(temp<min) min=temp;
        }
        for( i=un_r;i<=un_l+1 && i<l;i++)
        {
            int temp=A.get(i).intValue();
            if(temp>max) max=temp;
            if(temp<min) min=temp;
        }
        //System.out.println(min+" "+max);
        i=un_l-1;
        minindex=un_l;
        maxindex=un_r;
        while(un_l-->0)
        {
            int temp=A.get(un_l).intValue();
            if(temp>min)
            minindex=un_l;
        //System.out.print(un_l+" "+minindex+"\t");
        }
        //System.out.println();
        i=un_r+1;
        while(un_r++<l-1)
        {
            int temp=A.get(un_r).intValue();
            if(temp<max)
            maxindex=un_r;
        //System.out.print(un_r+" "+" "+maxindex+"\t");
        }
        //System.out.println();
        ar.add(minindex);
        ar.add(maxindex);
        return ar;
    }
}
