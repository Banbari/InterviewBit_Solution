public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        Data d[]=new Data[B.size()];
        String s[]=A.split("_");
        HashSet<String> hs=new HashSet<>();
        for(String temp:s)
        hs.add(temp);
        for(int i=0;i<B.size();i++)
        {
            String temp[]=B.get(i).split("_");
            int count=0;
            for(int j=0;j<temp.length;j++)
            {
                if(hs.contains(temp[j]))
                count++;
            }
            d[i]=new Data(B.get(i),i,count);
        }
        
        Arrays.sort(d,new Comparator<Data>(){
            public int compare(Data d1,Data d2)
            {
                return d2.count>d1.count?1:d2.count==d1.count?0:-1;
            }
        });
        ArrayList<Integer> ar=new ArrayList<>(B.size());
        for(int i=0;i<d.length;i++)
        {
            ar.add(d[i].index);
            //System.out.println(d[i].data+" "+d[i].index+" "+d[i].count);
        }
        return ar;
    }
    static class Data
    {
        String data;
        int index,count;
        Data(){}
        Data(String d,int in,int cnt)
        {
            data=d;
            index=in;
            count=cnt;
        }
    }
}
