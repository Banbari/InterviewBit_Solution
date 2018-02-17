public class Solution {
    public int maxp3(ArrayList<Integer> a) {
        Collections.sort(a);
        int prod=1;
        prod=Math.max(a.get(a.size()-1)*a.get(a.size()-2)*a.get(0),a.get(0)*a.get(1)*a.get(a.size()-1));
        prod=Math.max(prod,a.get(a.size()-1)*a.get(a.size()-2)*a.get(a.size()-3));
        return prod;
        /*Collections.reverse(a);
        int rs=1;
        ArrayList<Integer> b=new ArrayList<>();
        int n=a.size();
        while(--n>=0 && a.get(n)<0)
        b.add(a.get(n));
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<a.size()-b.size();i++)
        c.add(a.get(i));
        //int j=0,k=0;
        //System.out.println(a+"\n"+b+"\n"+c);
        int prod1=1;
        int prod2=1;
        int prod=1;
        if(b.size()>1)
        prod2=b.get(0)*b.get(1);
        if(c.size()>2)
        prod1=c.get(1)*c.get(2);
        if(c.size()>1 && b.size()>1)
        prod=Math.max(c.get(0)*prod1,c.get(0)*prod2);
        else
        prod=a.get(0)*a.get(1)*a.get(2);
        
        return prod;*/
    }
}
