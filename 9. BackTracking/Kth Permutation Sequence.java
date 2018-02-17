public class Solution {
	public String getPermutation(int n, int k) {
	   return findPermutation(n,k-1);
	}
	static public String findPermutation(int n, int k)
    {
    int[] numbers = new int[n];
    int[] indices = new int[n];
    for (int i = 0; i < n; i++)
        numbers[i] = i + 1;
    int divisor = 1;
    for (int place = 1; place <= n; place++)
    {
        if((k / divisor) == 0)
            break;
        indices[n-place] = (k / divisor) % place;
        divisor *= place;
    }

    for (int i = 0; i < n; i++)
    {
        int index = indices[i] + i;
        if(index != i)
        {
            int temp = numbers[index];
            for(int j = index; j > i; j--)
               numbers[j] = numbers[j-1];
            numbers[i] = temp;
        }
    }
    StringBuffer sf=new StringBuffer("");
    for(int i=0;i<n;i++)
    sf.append(numbers[i]);
    return sf.toString();
    }
}
