public class Solution {
public ArrayList<Integer> getRow(int a) {
	    ArrayList<Integer> ar=new ArrayList<>();
	    ArrayList<Integer> ar1=new ArrayList<>();
	ar.add(1);
	ar1.add(1);
    ar1.add(1);
if(a==0)
{
    return ar;
}
else if(a==1)
{
    return ar1;
}
else if(a>1)
{
    for(int i=2;i<=a;i++)
{
    ar.clear();
    ar.add(1);
    for(int j=1;j<ar1.size();j++)
    ar.add(ar1.get(j-1)+ar1.get(j));
    ar.add(1);
    ar1.clear();
    ar1.addAll(ar);
}
//System.out.println(ar1);
return ar;
}
return ar;
}
}
