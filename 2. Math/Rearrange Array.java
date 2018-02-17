public class Solution {
	public void arrange(ArrayList<Integer> a) {
	    int n=a.size();
	    ArrayList<Integer> ar=new ArrayList<>(a.size());
	    for(int i=0;i<a.size();i++)
	    {
	        ar.add(0);
	    }
	    for(int i=0;i<a.size();i++)
	    {
	        ar.set(i,a.get(a.get(i)));
	        //System.out.print(ar.get(i)+", ");
	    }
	    for(int i=0;i<a.size();i++)
	    {
	        a.set(i,a.get(i)+((a.get(a.get(i))%n)*n));
	    }
	    
	    for(int i=0;i<a.size();i++)
	    {
	        a.set(i,a.get(i)/n);
	    }
	}
}
