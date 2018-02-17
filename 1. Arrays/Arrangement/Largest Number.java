public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    int l=a.size();
	    int x[]=new int[l];
	    for(int i=0;i<l;i++)
	    x[i]=a.get(i);
	    sort(x,0,l-1);
	    StringBuffer st=new StringBuffer("");
	    int count=0;
	    for(int i=0;i<l-1;i++)
	    {
	        if(x[i]!=0) break;
	        count++;
	    }
	    for(int i=count;i<l;i++)
	    st.append(x[i]);
	    return st.toString();
	}
	public void sort(int a[],int l,int r)
	{
	    if(l<r)
	    {
	        int mid=l+(r-l)/2;
	        sort(a,l,mid);
	        sort(a,mid+1,r);
	        merge(a,l,mid,r);
	    }
	}
	
	void merge(int arr[], int l, int m, int r)
{
    int i, j, k=l;
    int n1=m - l + 1;
    int n2=r - m;
    int L[],R[];
    L=new int[n1];
    R=new int[n2];
    for (i=0;i<n1;i++)
        L[i]=arr[l+i];
    for (j=0;j<n2;j++)
        R[j]=arr[m+1+j];
    i=j=0;
    while (i<n1 && j<n2)
    {
        if (isLess(L[i],R[j]))
            arr[k++]=L[i++];
        else
            arr[k++]=R[j++];
    }
  while (i<n1)
    {
        arr[k++]=L[i++];
    }
  while (j<n2)
    {
        arr[k++]=R[j++];
    }
}
	    public static boolean isLess(int x,int y)
	    {
	        //return ((String.valueOf(x)+String.valueOf(y)).compareTo((String.valueOf(y)+String.valueOf(x))))==0?true:false;
	        StringBuffer s1=new StringBuffer("");
	        StringBuffer s2=new StringBuffer("");
	        s1.append(x).append(y);
	        s2.append(y).append(x);
	        String x1=(s1.toString());
	        String x2=(s2.toString());
	        int l=x1.compareTo(x2);
	        if(l>0)
	        return true;
	        else return false;
	    }
}
