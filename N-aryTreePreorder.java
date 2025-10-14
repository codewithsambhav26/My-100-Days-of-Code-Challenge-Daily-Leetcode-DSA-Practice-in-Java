class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> pre= new ArrayList<>();
        dfs(root,pre);
        return pre;
    }

    public void dfs(Node root,List<Integer> pre){
        if(root==null){
            return;
        }
        pre.add(root.val);
        for(Node child:root.children){
            dfs(child,pre);
        }
    }
}
