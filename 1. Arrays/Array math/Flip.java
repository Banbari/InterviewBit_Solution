public class Solution {
    public ArrayList<Integer> flip(String s) {
        char ch[]=s.toCharArray();
        int n=ch.length;
        ArrayList<Integer> rs;
        rs=new ArrayList<>();
        int l=-1,h=-1;
        int count=Integer.MIN_VALUE;
        int left=0;
        int total=0;
        for(int i=0;i<n;i++)
        {
                if(ch[i]=='0')
                total++;
                else
                total--;
                if(total<0)
                {
                    total=0;
                    left=i+1;
                }
                else if(total>count)
                {
                    count=total;
                    l=left;
                    h=i;
                }
        }
        //System.out.println(Arrays.toString(count));
        if(count>0)
        {
            rs.add(l+1);
            rs.add(h+1);
        }
        return rs;
    }
}
