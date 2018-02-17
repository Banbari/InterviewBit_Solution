public class Solution {
	int area=1;
	public int maximalRectangle(ArrayList<ArrayList<Integer>> a1) {
	   int a[][]=new int [a1.size()][a1.get(0).size()];
	   for(int i=0;i<a1.size();i++)
	   for(int j=0;j<a1.get(i).size();j++)
	   a[i][j]=a1.get(i).get(j).intValue();
	   return maximum(a);
	}
	public int maximum(int input[][]){
        int temp[] = new int[input[0].length];
        MaximumHistogram mh = new MaximumHistogram();
        int maxArea = 0;
        int area = 0;
        for(int i=0; i < input.length; i++){
            for(int j=0; j < temp.length; j++){
                if(input[i][j] == 0){
                    temp[j] = 0;
                }else{
                    temp[j] += input[i][j];
                }
            }
            area = mh.maxHistogram(temp);
            //area = maxArea(temp);
            if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    public int maxArea(int[] a) {
	    int area=0;
	    int i=0,j=a.length-1;
	    while(i<j)
	    {
	        area=Math.max(area,Math.min(a[i],a[j])*(j-i));
	        if(a[i]<a[j])
	        i++;
	        else
	        j--;
	    }
	    return area;
	}
}

class MaximumHistogram {

    public int maxHistogram(int input[]){
        Deque<Integer> stack = new LinkedList<Integer>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0; i < input.length;){
            if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
                stack.offerFirst(i++);
            }else{
                int top = stack.pollFirst();
                if(stack.isEmpty()){
                    area = input[top] * i;
                }
                else{
                    area = input[top] * (i - stack.peekFirst() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pollFirst();
            //if stack is empty means everything till i has to be
            //greater or equal to input[top] so get area by
            //input[top] * i;
            if(stack.isEmpty()){
                area = input[top] * i;
            }
            //if stack is not empty then everything from i-1 to input.peek() + 1
            //has to be greater or equal to input[top]
            //so area = input[top]*(i - stack.peek() - 1);
            else{
                area = input[top] * (i - stack.peekFirst() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}