public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> rs=new ArrayList<>();
        for(int i=1;i<=A;i++)
        {
            if(i%15==0)
            rs.add("FizzBuzz");
            else if(i%5==0)
            rs.add("Buzz");
            else if (i%3==0)
            rs.add("Fizz");
            else
            rs.add(i+"");
        }
        return rs;
    }
}
