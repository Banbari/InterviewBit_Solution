public class Solution {
    static class Person implements Comparator<Person>
    {
        Integer height,infront;
        Person()
        {
            
        }
        Person(int h,int i)
        {
            height=h;
            infront=i;
        }
        public int compare(Person a,Person b)
        {
            return a.height.compareTo(b.height);
        }
    }
	public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    if(heights.size()!=infronts.size())
	    return ar;
	    Person []p=new Person[heights.size()];
	    for(int i=0;i<p.length;i++)
	    {
	        p[i]=new Person(heights.get(i).intValue(),infronts.get(i).intValue());
	    }
	    Arrays.sort(p,new Person());
	    Person[] temp=new Person[p.length];
	    int n=temp.length;
	    for(Person p1:p)
	    {
	        int count=0;
	        for(int i=0;i<n;i++)
	        {
	            if(count==p1.infront)
	            {
	                while(temp[i]!=null && i<n-1)
	                i++;
	                temp[i]=p1;
	                break;
	            }
	            if(temp[i]==null)
	            count++;
	        }
	    }
	    for(Person p1:temp)
	    {
	        ar.add(p1.height);
	    }
	    return ar;
	}
}
