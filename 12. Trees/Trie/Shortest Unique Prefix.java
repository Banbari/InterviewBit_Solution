public class Solution {
	public ArrayList<String> prefix(ArrayList<String> a) {
	    Trie t=new Trie(a);
	    ArrayList<String> rs=new ArrayList<>(a.size());
	    for(int i=0;i<a.size();i++)
	    rs.add(t.searchPrefix(a.get(i)));
	    return rs;
	}
	static class TrieNode
	{
	    char ch;
	    boolean isLeaf;
	    int count;
	    HashMap<Character,TrieNode> children=new HashMap<>();
	    TrieNode(){}
	    TrieNode(char c)
	    {
	        ch=c;
	    }
	}
	static class Trie
	{
	    TrieNode root;
	    Trie(ArrayList<String> ar)
	    {
	        root=new TrieNode();
	        for(String node:ar)
	        insert(node);
	    }
	    void insert(String s)
	    {
	        HashMap<Character,TrieNode> children=root.children;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            TrieNode t=null;
	            if(children.containsKey(ch))
	            t=children.get(ch);
	            else
	            {
	                t=new TrieNode(ch);
	                children.put(ch,t);
	            }
	            children=t.children;
	            t.count++;
	            if(i==s.length()-1)
	            t.isLeaf=true;
	        }
	    }
	    String searchPrefix(String s)
	    {
	        StringBuffer rs=new StringBuffer("");
	        HashMap<Character,TrieNode> children=root.children;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            rs.append(ch);
	            TrieNode temp=children.get(ch);
	            if(temp.count<2 || temp.isLeaf)
	            {
	               //System.out.println(temp.count);
	                return rs.toString();
	            }
	            children=temp.children;
	        }
	        return rs.toString();
	    }
	}
}
