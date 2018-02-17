public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> ar=new ArrayList<>();
        int a=1,b=B;
        long sum=0;
        int n=A.length();
        for(int i=0;i<n;i++)
        {
            if(A.charAt(i)=='D')
            {
                ar.add(b);
                sum+=b+0l;
                b--;
            }
            else if(A.charAt(i)=='I')
            {
                ar.add(a);
                sum+=a+0l;
                a++;
            }
        }
        long total=(B+0l)*(B+1+0l)/2l;
        ar.add((int)(total-sum));
        //System.out.println(ar);
        return ar;
    }
}
