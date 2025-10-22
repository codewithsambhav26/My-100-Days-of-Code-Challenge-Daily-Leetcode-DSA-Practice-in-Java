class Solution {
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }
    int sum=0;
    public void dfs(TreeNode node,int path){
        if(node==null){
            return;
        }
        path=path*10+node.val;
        if(node.left==null && node.right==null){
            sum+=path;
        }
        dfs(node.left,path);
        dfs(node.right,path);
    }
}
