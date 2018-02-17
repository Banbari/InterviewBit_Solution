/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    HashMap<UndirectedGraphNode,UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
       map=new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
       return makeClone(node); 
    }
    public UndirectedGraphNode clone(UndirectedGraphNode node)
    {
        return new UndirectedGraphNode(node.label);
    }
    public UndirectedGraphNode makeClone(UndirectedGraphNode node)
    {
        if(node==null)
            return node;
        if(map.containsKey(node)){
            return map.get(node);
        }
        UndirectedGraphNode node1=new UndirectedGraphNode(node.label);
        map.put(node,node1);
        for(UndirectedGraphNode neigh:node.neighbors)
        {
            node1.neighbors.add(makeClone(neigh));
        }
        return node1;
    }
}
