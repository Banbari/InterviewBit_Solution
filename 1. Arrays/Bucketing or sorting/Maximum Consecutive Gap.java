public class Solution {
	// DO NOT MODIFY THE LIST
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
        if (L[i]<=R[j])
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
	
	public int maximumGap(final List<Integer> a1) {
	    int l=a1.size();
	    if(l<2) return 0;
	    int max=0;
	    int a[]=new int[l];
	    for(int i=0;i<l;i++)
	    a[i]=a1.get(i);
	    sort(a,0,l-1);
	    int prev=a[0];
	    int i=1;
	    while(i<l)
	    {
	        int curr=a[i++];
	        int diff=curr-prev;
	        if(max<diff) max=diff;
	        prev=curr;
	    }
	    return max;
	}
}
