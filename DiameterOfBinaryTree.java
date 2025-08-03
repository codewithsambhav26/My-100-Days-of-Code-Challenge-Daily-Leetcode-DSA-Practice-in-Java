class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftD=diameterOfBinaryTree(root.left);
        int rightD=diameterOfBinaryTree(root.right);
        int selfD=height(root.left)+height(root.right)+2;
        return Math.max(selfD, Math.max(leftD,rightD));
    }

    public static int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
}
