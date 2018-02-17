public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int l) {
	    int a[][]=new int[l][l];
	    int data=1;
	    int m=l,n=l;
	    int x=0,y=0;
	    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
	    ArrayList<Integer> ar;
	    while(x<m && y<n)
		 {
		     for(int i=y;i<n;i++)
		     a[x][i]=data++;
		     x++;
		     for(int i=x;i<m;i++)
		     a[i][n-1]=data++;
		     n--;
		     if(x<m)
		     {
		        for(int i=n-1;i>=y;i--)
		        a[m-1][i]=data++;
		        m--;
		     }
		     if(y<n)
		     {
		         for(int i=m-1;i>=x;i--)
		         a[i][y]=data++;
		         y++;
		     }
		 }
		 for(int i=0;i<l;i++)
		 {
		     ar=new ArrayList<>();
		     for(int j=0;j<l;j++)
		     ar.add(a[i][j]);
		     result.add(ar);
		 }
	    return result;
	}
}
