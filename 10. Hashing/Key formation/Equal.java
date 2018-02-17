public class Solution {
    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        ArrayList<Integer> rs=new ArrayList<>(4);
        int sum=0;
        int n=a.size();
        for(int i=0;i<n;i++)
        {
            int x=a.get(i).intValue();
            for(int j=i+1;j<n;j++)
            {
                sum=a.get(j).intValue()+x;
                ArrayList<Integer> curr=new ArrayList<>(2);
                curr.add(i);
                curr.add(j);
                if(hm.containsKey(sum))
                {
                  ArrayList<Integer> prev=(ArrayList)hm.get(sum);
                  int a1=prev.get(0).intValue(),b1=prev.get(1).intValue();
                  /*
                  A1 < B1, C1 < D1
  A1 < C1, B1 != D1, B1 != C1
                  */
                  boolean fl=a1<b1 && i<j && a1<i && b1!=j && b1!=i;
                  if(fl && isLess(prev,curr,rs))
                  {
                      rs=new ArrayList<>(4);
                      rs.add(prev.get(0).intValue());
                      rs.add(prev.get(1).intValue());
                      rs.add(curr.get(0).intValue());
                      rs.add(curr.get(1).intValue());
                      
                  }
                }
                else
                {
                    hm.put(sum,curr);
                }
            }
        }
        return rs;
    }
    public boolean isLess(ArrayList<Integer> prev,ArrayList<Integer> curr,ArrayList<Integer> rs)
    {
        /*
        A1 = A2 AND B1 < B2 OR
  A1 = A2 AND B1 = B2 AND C1 < C2 OR 
  A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2
        */
        if(rs.size()==0)
        return true;
        int a1=prev.get(0).intValue(),b1=prev.get(1).intValue(),c1=curr.get(0).intValue(),d1=curr.get(1).intValue();
        int a2=rs.get(0).intValue(),b2=rs.get(1).intValue(),c2=rs.get(2).intValue(),d2=rs.get(3).intValue();
        return ((a1<a2) || (a1==a2 && b1<b2) || (a1==a2 && b1==b2 && c1<c2) || (a1==a2 && b1==b2 && c1==c2 && d1<d2));
    }
}
