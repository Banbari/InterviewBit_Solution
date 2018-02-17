public class Solution {
    public boolean isPower(int a) {
        if(a==0 || a==1)
        return true;
        int l=(int)Math.sqrt(a);
        double p=0;
        for(int i=1;i<=l;i++)
        {
            p = Math.log(a) / Math.log(i);
        if(p - (int)p < 0.000000001)
        {
            return true;
        }
        }
        return false;
    }
}
