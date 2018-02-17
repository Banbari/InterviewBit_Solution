public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> ar) {
        int nums[]=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
        nums[i]=ar.get(i).intValue();
        int n = nums.length, max = 0;
  
  // accumulate the nums
  for (int i = 1; i < n; i++) {
    nums[i] += nums[i - 1];
  }
  
  for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
      // calculate the sum between i ... j
      int sum = nums[j] - (i > 0 ? nums[i - 1] : 0);
      
      if (sum == 0 && j - i + 1 > max) {
        max = j - i + 1;
      }
    }
  }
  
  return max;
    }
}
