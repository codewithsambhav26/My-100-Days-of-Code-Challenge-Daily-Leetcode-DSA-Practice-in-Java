class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p==null || q==null || p.val!=q.val){ //non-identical
            return false;
        }

        if(!isSameTree(p.left,q.left)){
            return false;
        }
        if(!isSameTree(p.right, q.right)){
            return false;
        }
        return true;
    }
}
