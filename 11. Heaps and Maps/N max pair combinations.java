public class Solution
{
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B)
    {
        ArrayList<Integer> ar=new ArrayList<>();
        PriorityQueue<Data> pq=new PriorityQueue<>(A.size()+1,new Comparator<Data>()
        {
            public int compare(Data a,Data b)
            {
                return b.sum.compareTo(a.sum);
            }
        });
        if(A.size()==0)
        return ar;
        else if(A.size()==1)
        {
            ar.add(A.get(0)+B.get(0));
        return ar;
        }
        Collections.sort(A);
        Collections.sort(B);
        for(int i=A.size()-1;i>=0;i--)
        System.out.print(A.get(i)+" ");
        System.out.println();
        for(int i=A.size()-1;i>=0;i--)
        System.out.print(B.get(i)+" ");
        System.out.println();
        int i=A.size()-1;
        int j=B.size()-1;
        pq.add(new Data(A.get(i)+B.get(j),i,j));
        while(ar.size()<A.size()-1 && i>0 && j>0)
        {
            Data d=pq.poll();
            System.out.println(d);
            i=d.i;
            j=d.j;
            pq.add(new Data(A.get(i)+B.get(j-1),i,j-1));
            pq.add(new Data(A.get(i-1)+B.get(j),i-1,j));
            ar.add(d.sum);
        }
        ar.add(pq.poll().sum);
        return ar;
    }
    static class Data
    {
        Integer sum,i,j;
        Data(Integer s,Integer i1,Integer j1)
        {
            sum=s;
            i=i1;
            j=j1;
        }
        public String toString()
        {
            return ""+sum+" "+i+" "+j;
        }
        public boolean equals(Object d1)
        {
            Data d=(Data)d1;
            return d.j!=j && d.i!=i;
        }
    }
}