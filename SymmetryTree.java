class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        
        return symmetry(root.left,root.right);
    }

    public boolean symmetry(TreeNode rootleft,TreeNode rootright){
        if(rootleft == null && rootright == null){
            return true;
        }
        else if(rootleft == null || rootright == null){
            return false;
        }
        if(rootleft.val!=rootright.val){
            return false;
        }
        if(!symmetry(rootleft.left,rootright.right)){
            return false;
        }
        if(!symmetry(rootleft.right,rootright.left)){
            return false;
        }

        return true;
    }
}
