public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ar=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<B;i++)
        {
            int x=A.get(i);
            if(hm.containsKey(x))
            {
                hm.put(x,hm.get(x)+1);
            }
            else
            hm.put(x,1);
        }
        ar.add(hm.size());
        for(int i=B;i<A.size();i++)
        {
            int x=A.get(i-B);
            int y=A.get(i);
            if(hm.get(x)>1)
            hm.put(x,hm.get(x)-1);
            else
            hm.remove(x);
            if(hm.containsKey(y))
            {
                hm.put(y,hm.get(y)+1);
            }
            else
            hm.put(y,1);
            ar.add(hm.size());
        }
        return ar;
    }
}
