public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    boolean fl=false;
	    for(int i=0;i<a.size();i++)
	    if(a.get(i)==b)
	    {
	        ar.add(i);
	        fl=true;
	        break;
	    }
	    for(int i=a.size()-1;i>=0;i--)
	    if(a.get(i)==b)
	    {
	        fl=true;
	        ar.add(i);
	        break;
	    }
	    if(ar.size()==0)
	    {
	        ar.add(-1);
	        ar.add(-1);
	    }
	    return ar;
	    /*if(a.size()==0)
	    {
	        ar.add(-1);
	        ar.add(-1);
	        return ar;
	    }
	    else if(a.size()==1)
	    {
	        ar.add(-0);
	        ar.add(0);
	        return ar;
	    }
	    return findRange(a,0,a.size()-1,b,ar);*/
	}
	
	public ArrayList<Integer> findRange(List<Integer> a,int l,int h,int b,ArrayList<Integer> rs)
	{
	    int pos=-1;
	    int mid=-1;
	    while(l<=h)
	    {
	        mid=(l+h)>>>1;
	        if(a.get(mid)==b)
	        {
	            pos=mid;
	            break;
	        }
	        else if(b>a.get(mid))
	        l=mid+1;
	        else if(b<a.get(mid))
	        h=mid-1;
	    }
	    if(pos!=-1)
	    {
	        if(pos==l || pos==h)
	        {
	           rs.add(pos);
	           rs.add(pos);
	        return rs; 
	        }
	        l=h=mid;
	        while(l>0 && a.get(l)==b)
	        l--;
	        while(h<a.size() && a.get(h)==b)
	        h++;
	        //if(l>h) l--;
	        rs.add(l+1);
	        rs.add(h-1);
	        return rs;
	    }
	    rs.add(-1);
	    rs.add(-1);
	    return rs;
	}
}
