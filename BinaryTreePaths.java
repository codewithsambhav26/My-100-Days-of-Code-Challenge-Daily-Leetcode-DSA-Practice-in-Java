class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        dfs(root,"",ans);
        return ans;
    }

    private void dfs(TreeNode node, String path, List<String> ans){
        if(node==null){
            return;
        }
        path+=node.val;
        if(node.left == null && node.right == null){
            ans.add(path);
        }
        path+="->";
        dfs(node.left,path,ans);
        dfs(node.right,path,ans);
    }
}
