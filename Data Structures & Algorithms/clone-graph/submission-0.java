class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        Map<Node,Node> oldNewNodeMap = new HashMap<>();

        

        return dfs(node, oldNewNodeMap);
    }

    private Node dfs(Node node, Map<Node,Node> alreadyCopiedNode){
        Node copy = new Node(node.val);
        alreadyCopiedNode.put(node, copy);

        for(Node neighbor : node.neighbors){
            if(!alreadyCopiedNode.containsKey(neighbor)){
                Node copiedNeighbor = dfs(neighbor, alreadyCopiedNode);
                copy.neighbors.add(copiedNeighbor);
            }else{
                copy.neighbors.add(alreadyCopiedNode.get(neighbor));
            }
        }

        return copy;
    }
}

/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

