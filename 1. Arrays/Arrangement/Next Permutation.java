public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
	    int i=a.size()-1;
            if(i>0)
            {
	    while(i>0 && a.get(i)<a.get(i-1))
	    {
	        i--;
	        if(i<=0)
	        {
	           Collections.sort(a);
	           /*Iterator it=a.iterator();
	           while(it.hasNext())
	           System.out.print(it.next()+" ");
	           System.exit(0);*/
	           return;
	        }
	    }
	    int j=a.size()-1;
	    while(a.get(j)<a.get(i-1))
	    j--;
	    int temp=a.get(i-1);
	    a.set(i-1,a.get(j));
	    a.set(j,temp);
	    j = a.size() - 1;
	    while (i < j) {
        temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
        i++;
        j--;
    }
            }
    /*Iterator it=a.iterator();
	           while(it.hasNext())
	           System.out.print(it.next()+" ");
	*/
	}
}
