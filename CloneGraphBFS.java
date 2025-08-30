class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList();
        Map<Integer, Node> cloneMap = new HashMap();
        queue.add(node);
        cloneMap.put(node.val, new Node(node.val));
       
        while (!queue.isEmpty()) {
            Node cur = queue.remove();
            Node clone = cloneMap.getOrDefault(cur.val, new Node(cur.val));
            cloneMap.put(cur.val, clone);
            for (Node child : cur.neighbors) {
                Node childClone = cloneMap.getOrDefault(child.val, new Node(child.val));
                clone.neighbors.add(childClone);
                if (!cloneMap.containsKey(child.val)) {
                    queue.add(child);
                }
                cloneMap.put(child.val, childClone);
            }
        }
        return cloneMap.get(node.val);
    }
}
