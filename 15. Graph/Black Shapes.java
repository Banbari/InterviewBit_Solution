public class Solution {
    int count=0;
    public int black(ArrayList<String> a) {
        count=0;
        if(a.size()==0)
        return 0;
        char ch[][]=new char[a.size()][a.get(0).length()];
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a.get(i).length();j++)
            {
                ch[i][j]=a.get(i).charAt(j);
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[i].length;j++)
            {
                if(ch[i][j]=='X')
                {
                    call(ch,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void call(char ch[][],int i,int j)
    {
        if(i<0 || j<0 || i>=ch.length || j>=ch[0].length)
        return;
        if(ch[i][j]=='O')
        return;
        ch[i][j]='O';
        call(ch,i+1,j);
        call(ch,i-1,j);
        call(ch,i,j+1);
        call(ch,i,j-1);
    }
}
