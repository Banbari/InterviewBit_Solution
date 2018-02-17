public class Solution {
    //static int count=0;
	public ArrayList<String> restoreIpAddresses(String s) {
	    ArrayList<String> res = new ArrayList<String>(); 
	    //ArrayList<Integer> temp=new ArrayList<>();
	    int count=0;
        if (s.length()<4||s.length()>12) return res;  
        for(int i=1;i<4 && i<s.length();i++)
        {
            String first=s.substring(0,i);
            if(isValid(first))
            {
                for(int j=i;j<i+4 && j<s.length();j++)
                {
                    String second=s.substring(i,j);
                    if(isValid(second))
                    {
                        for(int k=j;k<j+4 && k<s.length();k++)
                        {
                            count++;
                            String third=s.substring(j,k);
                            String fourth=s.substring(k,s.length());
                            if(isValid(third) && isValid(fourth))
                            {
                                res.add(first+"."+second+"."+third+"."+fourth);
                            }
                        }
                    }
                }
            }
        }
        //dfs(s,"",res,0);  
        return res; 
	}
	public static void dfs(String s,String tmp,ArrayList<String> res,int count){  
        if (count==3 && isValid(s)) {  
            res.add(tmp+s);  
            return;  
        }  
        for(int i=1; i<4 && i<s.length(); i++){  
           // temp.add(1);
            String substr=s.substring(0,i);  
            if (isValid(substr)){  
                dfs(s.substring(i),tmp+substr+'.',res,count+1);  
            }  
        }  
    }  
      
    public static boolean isValid(String s){  
        if(s.length()==0)
        return false;
        if (s.charAt(0)=='0') return s.equals("0");  
        int num = Integer.parseInt(s);  
        return num<=255 && num>0;  
    }  
}
