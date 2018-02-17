public class Solution {
	public int romanToInt(String a) {
	    int l=a.length();
	    int sum=0;
	    int prev=Integer.MAX_VALUE,curr=0;
	    for(int i=0;i<l;i++)
	    {
	        //System.out.print(prev+" ");
	        switch(a.charAt(i))
	        {
	            case 'M':
	                {
	                    curr=1000;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                    break;
	                }
	           case 'D':
	                {
	                    curr=500;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                     break;
	                }
	           case 'C':
	                {
	                    curr=100;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                     break;
	                }
	           case 'L':
	                {
	                    curr=50;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                     break;
	                }
	          case 'X':
	                {
	                    curr=10;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                     break;
	                }
	         case 'V':
	                {
	                    curr=5;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                     break;
	                }
	       case 'I':
	                {
	                    curr=1;
	                    if(curr>prev)
	                    {
	                        curr-=prev;
	                        sum-=prev;
	                    }
	                        sum+=curr;
	                        prev=curr;
	                    
	                     break;
	                }
	        }
	        //System.out.println(sum+" "+curr);
	    }
	    return sum;
	}
}
