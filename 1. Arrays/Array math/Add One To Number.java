public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    int i=0;
	    while(i<a.size() && a.get(i)==0) {i++;}
	    for(;i<a.size();i++)
	    {
	        ar.add(a.get(i));
	    }
	    if(ar.size()==0) ar.add(1);
	    else
	    {
	        if(ar.get(ar.size()-1)+1<=9)
	        ar.set(ar.size()-1,ar.get(ar.size()-1)+1);
	        else
	        {
	            ar=call(ar);
	        }
	    }
	    return ar;
	}
	public ArrayList<Integer> call(ArrayList<Integer> a)
	{
	    int l=a.size();
	    int i=l-1;
	    while(i>=0 && a.get(i)+1>9)
	         {a.remove(i);i--;}
	    if(i>=0) a.set(i,a.get(i)+1);
	    else
	    a.add(1);
	    for(int j=i+1;j<l;j++)
	    a.add(0);
	    return a;
	}
	
}
