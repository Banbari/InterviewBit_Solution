public class Solution {
	public ArrayList<Integer> maxone(ArrayList<Integer> arr, int b) {
	    int maxLength=0;
        int start=0;
        ArrayList<Integer> result=new ArrayList<Integer>();
        int curZerosCnt=0;
        int curStart=0;
        int curLength=0;
        for (int i=0;i<arr.size();i++) {
            if (arr.get(i)==0) {
                curZerosCnt++;
            }
            if (arr.get(i)==0&&curZerosCnt>b) {                     //{ 1 1 0 1 1 0 0 1 1 1 }
                int nStart=findLeftMostZeroInclusive(arr,curStart);
                curLength-=nStart-curStart-1;
                curStart=nStart;
                curZerosCnt--;
                continue;
            }
            if (++curLength>maxLength) {
                start=curStart;
                maxLength=curLength;
            }
        }
        
        // Move from start, flip m zero elements to 1
        int i=start;
        int j=0;
        for (int p= b;i<arr.size() && (p>0 || j<maxLength);i++) {
            if (arr.get(i)==0) {
                result.add(i);
                j++;
                p--;
            }
            else{
                result.add(i);
                j++;
            }
        }        
        return result;
    }
    
    private static int findLeftMostZeroInclusive(ArrayList<Integer> arr,int curStart) {
        int i=curStart;
        while(arr.get(i)!=0 && arr.size()>i-1) {
            i++;
        }
        // returning the next element after 0
        return i+1;
	}
}
