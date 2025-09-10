class Solution {
    public TreeNode buildTree(int[] preorder,int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index={0};

        return helper(preorder,inorder,0,preorder.length-1,map,index);
    }

    private static TreeNode helper(int[] preorder,int[] inorder,int left,int right,HashMap<Integer,Integer> map,int[] index){
        if(left>right){
            return null;
        }
        int curr=preorder[index[0]];
        index[0]++;
        TreeNode node=new TreeNode(curr);
        if(left==right){
            return node;
        }
        int inorderIdx=map.get(curr);
        node.left=helper(preorder,inorder,left,inorderIdx-1,map,index);
        node.right=helper(preorder,inorder,inorderIdx+1,right,map,index);

        return node;
    }
}
