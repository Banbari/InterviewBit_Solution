public class Solution {
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
	    Collections.sort(a);
	    ArrayList<ArrayList<Integer>> rs=new ArrayList<>();
	    backtrack(rs,new ArrayList<Integer>(),a,0);
	    return rs;
	}
	private void backtrack(ArrayList<ArrayList<Integer>> list,ArrayList<Integer>temp,ArrayList<Integer> nums,int start){
    list.add(new ArrayList<>(temp));
    for(int i=start;i<nums.size();i++){
        temp.add(nums.get(i).intValue());
        backtrack(list,temp,nums,i+1);
        temp.remove(temp.size()-1);
    }
	}
}
