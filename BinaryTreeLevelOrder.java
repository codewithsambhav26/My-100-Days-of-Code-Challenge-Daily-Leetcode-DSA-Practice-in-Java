class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
       
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currNode=q.remove();
                if(currNode==null){
                  if(q.isEmpty()){
                    break;
                  }else{
                    q.add(null);
                  }
                }else{
                    list.add(currNode.val);
                    if(currNode.left!=null){
                      q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                      q.add(currNode.right);
                    }
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
