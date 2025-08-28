class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        q.add(null);
        TreeNode prev=root;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                if(q.isEmpty() || q.peek()==null){
                    if(prev!=null){
                        ans.add(prev.val);
                    }    
                    return ans;
                }
                q.add(null);
                ans.add(prev.val);
                continue;
            }
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            prev=curr;
        }
        return ans;
    }
}
