void setZeroes(int** A, int n11, int n12) {
    int i,j,k,s;
    int row[n11];
    int col[n12];
    for(i=0;i<n11;i++)
    {
        for(j=0;j<n12;j++)
        {
            if(A[i][j]==0)
            {
                row[i]=1;
                col[j]=1;
            }
        }
    }
    for(k=0;k<n11;k++)
    {
        for(s=0;s<n12;s++)
        {
            if((row[k]==1)||(col[s]==1))
            {
                A[k][s]=0;
            }
        }
    }
}
