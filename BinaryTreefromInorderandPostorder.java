class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        // Start from the last index of postorder
        int[] index = {postorder.length-1};

        return helper(inorder,postorder,0,inorder.length-1,map,index);
    }

    private static TreeNode helper(int[] inorder,int[] postorder,int left,int right, HashMap<Integer,Integer> map,int[] index){
        if (left>right) {
            return null;
        }
        int curr=postorder[index[0]];
        index[0]--;
        TreeNode node=new TreeNode(curr);

        if (left==right){
            return node;
        }

        int inorderIdx=map.get(curr);
        node.right=helper(inorder,postorder,inorderIdx+1,right,map,index);
        node.left=helper(inorder,postorder,left,inorderIdx-1,map,index);

        return node;
    }
}
