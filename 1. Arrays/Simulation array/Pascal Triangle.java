public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> sol=new ArrayList<>();
	     ArrayList<Integer> ar=new ArrayList<>();
	    ArrayList<Integer> ar1=new ArrayList<>();
	    ar.add(1);
	ar1.add(1);
    //ar1.add(2);
    ar1.add(1);
if(a==1)
{
    sol.add(ar);
    return sol;
}
else if(a==2)
{
    sol.add(ar);
    sol.add(ar1);
    return sol;
}
else if(a>2)
{
    ArrayList<Integer> temp=new ArrayList<>();
    sol.clear();
    temp=new ArrayList<Integer>();
    temp.addAll(ar);
    
    sol.add(temp);
    temp=new ArrayList<Integer>();
    temp.addAll(ar1);
    sol.add(temp);
    for(int i=0;i<a-2;i++)
{
    ar.clear();
    ar.add(1);
    for(int j=1;j<ar1.size();j++)
    ar.add(ar1.get(j-1)+ar1.get(j));
    ar.add(1);
    ar1.clear();
    ar1.addAll(ar);
    temp=new ArrayList<Integer>();
    temp.addAll(ar);
    sol.add(temp);
}
//System.out.println(sol);
return sol;
}
return sol;
}
}
