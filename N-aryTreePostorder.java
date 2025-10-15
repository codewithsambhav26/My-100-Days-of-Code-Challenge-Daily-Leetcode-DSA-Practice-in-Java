class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> post= new ArrayList<>();
        dfs(root,post);
        return post;
    }

    public void dfs(Node root,List<Integer> post){
        if(root==null){
            return;
        }
        for(Node child:root.children){
            dfs(child,post);
        }
        post.add(root.val);
    }
}
