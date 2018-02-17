public class Solution {
    public int solve(String A) {
        StringBuffer s=new StringBuffer(A);
        s.append(' ');
        s.append(new StringBuffer(A).reverse().toString());
        char ch[]=s.toString().toCharArray();
        int a[]=new int[ch.length];
        computeLPSArray(ch,ch.length,a);
        /*int count=0;
        for(int i=0;i<s.length()/2;i++)
        {
          if(s.charAt(i)!=s.charAt(s.length()-i-1))
          {
              s.insert(i,s.charAt(s.length()-i-1));
              count++;
          }
        }
        return count;*/
        return A.length()-a[ch.length-1];
    }
    static void computeLPSArray(char pat[], int M, int [] lps)
  {
      int len = 0;
      int i;

      lps[0] = 0;
      i = 1;
      while (i < M)
      {
         System.out.print(pat[i]+" ");
         if (pat[i] == pat[len])
         {
           len++;
           lps[i] = len;
           i++;
         }
         else
         {
           if (len != 0)
           {
             len = lps[len-1];
           }
           else
           { 
               lps[i] = 0;
             i++;
           }
         }
         System.out.println(Arrays.toString(lps));
      }
  }  
}
