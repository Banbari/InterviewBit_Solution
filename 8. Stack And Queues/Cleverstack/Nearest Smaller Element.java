public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        StackA st=new StackA(arr.size());
        ArrayList<Integer> ar=new ArrayList<>(arr.size());
        for(int i=0;i<arr.size();i++)
        {
            while(!st.isEmpty() && st.peek()>=arr.get(i).intValue())
            st.pop();
            if(st.isEmpty())
               ar.add(-1);
            else
                ar.add(st.peek());
            st.push(arr.get(i).intValue());
        }
        return ar;
    }
}

class StackA
{
    int top;
    int data[]=null;
    StackA(int n)
    {
        top=-1;
        data=new int[n];
    }
    public void push(int ele)
    {
        data[++top]=ele;
    }
    public int pop()
    {
        if(!isEmpty())
        return data[top--];
        return 0;
    }
    public int peek()
    {
        if(!isEmpty())
        return data[top];
        return 0;
    }
    public boolean isEmpty()
    {
        return top == -1 ? true: false;
    }
}
