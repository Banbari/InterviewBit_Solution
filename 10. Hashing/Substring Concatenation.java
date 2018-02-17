public class Solution {
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	    ArrayList<Integer> result = new ArrayList<Integer>();        
        if(b.size() == 0 || a == null || b == null || a.length() == 0) 
            return result;
        
        char[] array=a.toCharArray();
        int length=array.length;
        
        int num=b.size()*b.get(0).length();
        int strLength=b.get(0).length();
        
        
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<b.size();i++){
            if(map.containsKey(b.get(i)))
                map.put(b.get(i),map.get(b.get(i))+1);
            else
                map.put(b.get(i),1);
        }
        
        
        
        for(int i=0;i<=length-num;i++){ 
            HashMap<String,Integer> tempMap=(HashMap<String, Integer>)map.clone();
            for(int j=0;j < b.size(); j++){
               String str = a.substring(i + j * strLength, i + (j + 1) * strLength);
                if(!tempMap.containsKey(str)){
                    break;
                }
                else if(tempMap.get(str) > 1){
                    tempMap.put(str, tempMap.get(str) -  1);
                }
                else if(tempMap.get(str) == 1){
                    tempMap.remove(str);
                }
            }
            if(tempMap.isEmpty())
                result.add(i);
            }
           // System.out.println(result);
        return result;  
	}
}
