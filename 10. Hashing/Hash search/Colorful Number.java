public class Solution {
	public int colorful(int a) {
	    HashSet<Integer> set=new HashSet<>();
	    ArrayList<Integer> list=new ArrayList<>();
	    while(a>0)
	    {
	        list.add(a%10);
	        a/=10;
	    }
	    int i = 0;
        while(i < list.size()){
            
            int j = i + 1;
            //System.out.printf("For i = %d and j = %d \n ", i ,  j);
            if(!set.add(list.get(i)))
                return 0;
            //System.out.println("\t digit = " + list.get(i));
            int result = list.get(i);
            //System.out.println("Result before j loop:" +result);
            while(j < list.size() && i != list.size() - 1){
                result = result * list.get(j);
                if(!set.add(result))
                    return 0;
                j++;
            }
            i++;                    
        }
        //System.out.println(set);
	    return 1;
	}
}
