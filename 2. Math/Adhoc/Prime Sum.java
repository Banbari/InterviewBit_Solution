public class Solution {
     public ArrayList<Integer> primesum(int a) {
        Integer x=a;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=2;i<a;i++)
        {
            if(isPrime(i)&& isPrime(a-i))
            {
                ar.add(i);
                ar.add(a-i);
                return ar;
            }
        }
        return ar;
    }
    public boolean isPrime(int x)
    {
        if(x==0 || x==1)
        return false;
        for(int i=2;i<=Math.sqrt(x);i++)
        if(x%i==0) return false;
        return true;
    }
}