class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }

    public void helper(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        if(root.left!=null){
            helper(root.left,ans);
        }
        if(root.right!=null){
            helper(root.right,ans);
        }
        ans.add(root.val);
    }
}
