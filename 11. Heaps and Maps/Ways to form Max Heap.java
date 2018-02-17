public class Solution {
    public int solve(int n) {
        if(n==1||n==0) return 1;
    
    int h=(int)(Math.ceil(Math.log(n+1)/Math.log(2)));
    
    int x=(int)(Math.pow(2,h-1)-1);
    int y=n-x;
    int L=(x-1)/2;
    int R=(x-1)/2;
    int p=(int)(Math.pow(2,h-2));
    if(p>y)
    {
        L=L+y;
    }
    else
    {
        L=L+p;
        R=R+(y-p);
    }
    long pp=1;
    int i,j;
    int f1[]=new int[101];
    int f2[]=new int[101];
    
    for(i=0;i<L;i++)
    {
        int t;
        t=n-1-i;
        for(j=2;j<=t;j++)
        {
            while(t%j==0) {f1[j]++;t=t/j;}
        }
        t=i+1;
        for(j=2;j<=t;j++)
        {
            while(t%j==0) {f2[j]++;t=t/j;}
        }
        
    }
    
    for(i=2;i<=100;i++)
    {
        int t=f1[i]-f2[i];
        for(j=0;j<t;j++)
        {
            pp=(pp*i)%1000000007;
        }
    }
    long r=(pp*solve(R))%1000000007;
    r=(r*solve(L))%1000000007;
    
    return (int)r;
    }
}
