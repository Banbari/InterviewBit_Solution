public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int diff=Integer.MAX_VALUE;
        int i=0,j=0,k=0;
        int n1=A.size(),n2=B.size(),n3=C.size();
        int a=0,b=0,c=0;
        while(i<n1 && j<n2 && k<n3)
        {
            a=A.get(i);
            b=B.get(j);
            c=C.get(k);
            diff=Math.min(diff,Math.abs(max(a,b,c)-min(a,b,c)));
            if(a<=b && a<=c)
            i++;
            else if(b<=a && b<=c)
            j++;
            else if(c<=a && c<=b)
            k++;
        }
        return diff;
    }
    int min(int a,int b,int c)
    {
        int min=a;
        if(min>b)
        min=b;
        if(min>c)
        min=c;
        return min;
    }
    
    int max(int a,int b,int c)
    {
        int max=a;
        if(max<b)
        max=b;
        if(max<c)
        max=c;
        return max;
    }
}
