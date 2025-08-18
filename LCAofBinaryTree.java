class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }
        TreeNode leftLCA=lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA=lowestCommonAncestor(root.right, p, q);

        //leftLCA=val rightLCA=null
        if(rightLCA==null){
            return leftLCA;
        }
        //leftLCA=null rightLCA=val
        if(leftLCA==null){
            return rightLCA;
        }

        return root;
    }
}
