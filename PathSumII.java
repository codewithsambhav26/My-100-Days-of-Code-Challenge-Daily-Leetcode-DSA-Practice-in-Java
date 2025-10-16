class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,0,new ArrayList<>(),ans,targetSum);
        return ans;
    }

    public void dfs(TreeNode root,int sum, List<Integer> path, List<List<Integer>> list,int targetSum){
        if(root==null){
            return;
        }
        path.add(root.val);
        sum=sum+root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                list.add(new ArrayList<>(path));
            }
        }else{
            dfs(root.left,sum,path,list,targetSum);
            dfs(root.right,sum,path,list,targetSum);
        }
        path.remove(path.size()-1);
        sum=sum-root.val;
    }
}
