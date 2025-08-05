class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val<key){
            root.right=deleteNode(root.right, key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left, key);
        }else{ // root=val
            //case 1 - leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 - one child node
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3 - both child node
            TreeNode IS=findInorderSuccessor(root.right);
            root.val=IS.val;
            root.right=deleteNode(root.right, IS.val);
        }

        return root;
    }

    public static TreeNode findInorderSuccessor(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
