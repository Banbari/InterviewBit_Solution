public class Solution {
	public int largestRectangleArea(ArrayList<Integer> a) {
	    ArrayDeque<Integer> st=new ArrayDeque<>();
	    int maxArea=0,area=0,i=0;
	    for(i=0;i<a.size();)
	    {
	        if(st.isEmpty() || a.get(st.peek())<=a.get(i).intValue())
	            st.push(i++);
	        else
	        {
	            int top=st.pop();
	            if(st.isEmpty())
	            {
	                area=a.get(top).intValue()*i;
	            }
	            else
	            {
	                area=a.get(top).intValue()*(i-st.peek()-1);
	            }
	            maxArea=Math.max(area,maxArea);
	        }
	    }
	    while(!st.isEmpty())
	    {
	        int top=st.pop();
	        if(st.isEmpty())
	        area=a.get(top).intValue()*i;
	        else
	        area=a.get(top).intValue()*(i-st.peek()-1);
	        maxArea=Math.max(area,maxArea);
	    }
	    return maxArea;
	}
}
