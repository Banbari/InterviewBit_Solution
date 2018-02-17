public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> A) {
	    int max=Integer.MIN_VALUE;
	    int diff=Integer.MIN_VALUE;
	    int l=A.size();
	    if(l==0) return -1;
	   
	    int a[][]=new int[l][2];
	    for(int i=0;i<l;i++)
	    {
	        a[i][0]=A.get(i).intValue();
	        a[i][1]=i;
	    }
	    sort(a,0,l-1);
	    int in[]=new int[l];
	    in[l-1]=a[l-1][1];
	    for(int i=l-2;i>=0;i--)
	    {
	        int max1=Math.max(a[i][1],in[i+1]);
	        in[i]=max1;
	    }
	    for(int i=l-1;i>0;i--)
	    {
	        int max1=in[i]-a[i-1][1];
	        if(max1>max)
	        max=max1;
	    }
	    if(max<0)
	    return 0;
	    else return max;
	}
	public void sort(int a[][],int l,int r)
	{
	    if(l<r)
	    {
	        int mid=l+(r-l)/2;
	        sort(a,l,mid);
	        sort(a,mid+1,r);
	        merge(a,l,mid,r);
	    }
	}
	
void merge(int arr[][], int l, int m, int r)
{
    int i, j, k=l;
    int n1=m - l + 1;
    int n2=r - m;
    int L[][],R[][];
    L=new int[n1][2];
    R=new int[n2][2];
    for (i=0;i<n1;i++)
        {
            L[i][0]=arr[l+i][0];
            L[i][1]=arr[l+i][1];
            
        }
    for (j=0;j<n2;j++)
    {
        R[j][0]=arr[m+1+j][0];
        R[j][1]=arr[m+1+j][1];
        
    }
    i=j=0;
    while (i<n1 && j<n2)
    {
        if (L[i][0]<=R[j][0])
            {
                arr[k][0]=L[i][0];
                arr[k][1]=L[i][1];
                i++;
                k++;
            }
        else
            {
                arr[k][0]=R[j][0];
                arr[k][1]=R[j][1];
                k++;
                j++;
            }
    }
  while (i<n1)
    {
        arr[k][0]=L[i][0];
        arr[k][1]=L[i][1];
        k++;
        i++;
    }
  while (j<n2)
    {
        arr[k][0]=R[j][0];
        arr[k][1]=R[j][1];
        k++;
        j++;
    }
}
}
