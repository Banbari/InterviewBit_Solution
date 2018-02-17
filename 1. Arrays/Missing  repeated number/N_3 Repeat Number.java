public class Solution {
	// DO NOT MODIFY THE LIST
	
	public int repeatedNumber(final List<Integer> A) {
	    int len = A.size();
        if (A.size() == 0) {
            return -1;
        }
        if (A.size() == 1) {
            return A.get(0);
        }
        int candidate1 = 0;
        int candidate2 = 1;
        int count1 = 0;
        int count2 = 0;
        for (int num : A) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : A) {
            if (candidate1 == num) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        if (count1 > len / 3) {
            return candidate1;
        } else if (count2 > len / 3) {
            return candidate2;
        } else {
            return -1;
        }
	}
}
