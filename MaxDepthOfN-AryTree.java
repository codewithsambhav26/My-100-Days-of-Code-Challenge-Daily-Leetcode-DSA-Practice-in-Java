class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int height = 0;
        for(Node node: root.children){
            height = Math.max(height, maxDepth(node));
        }                                        
        return height+1;
    } 
}
