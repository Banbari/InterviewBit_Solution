public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    HashMap<Integer,Array> hs=new HashMap<>();
	    ArrayList<ArrayList<Integer>> ar=new ArrayList<>(a.size());
	    for(int i=1;i<=a.size();i++)
	    {
	        ArrayList<Integer> ar1=new ArrayList<>();
	        ar1.add(i);
	        ar.add(ar1);
	    }
	    int i=1;
	    for(String s:a)
	    {
	        int x[]=new int[27];
	        x[26]=i++;
	        int n=s.length();
	        int value=0;
	        for(int j=0;j<n;j++)
	        {
	            x[s.charAt(j)-'a']++;
	            value=(s.charAt(j))+value;
	        }
	        
	            if(hs.containsKey(value))
	            {
	                int y[]=hs.get(value).a;
	                int k=0;
	                for(;k<26;k++)
	                {
	                    if(x[k]!=y[k])
	                    break;
	                }
	                if(k==26)
	                {
	                    ar.get(y[26]-1).add(x[26]);
	                    ar.get(x[26]-1).set(0,-1);
	                }
	            }
	            else
	            hs.put(value,new Array(x));
	    }
	    int index=0;
	    for(ArrayList<Integer> temp:ar)
	    {
	        if(temp.get(0).intValue()==-1)
	        continue;
	        else
	        ar.set(index++,temp);
	    }
	    ArrayList<ArrayList<Integer>> ar2=new ArrayList<>(index);
	    for(i=0;i<index;i++)
	    ar2.add(ar.get(i));
	    return ar2;
	}
	static class Array
	{
	    int a[];
	    Array(int[] x)
	    {
	        a=x;
	    }
	}
}
