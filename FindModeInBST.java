class Solution {
    int maxCount=1;
    public int[] findMode(TreeNode root){
        Map<Integer,Integer> map=new HashMap<>();
        findMode(root,map);
        
        int ans[]=new int[map.size()];
        int index=0;
        for(Integer key:map.keySet()){
            if(map.get(key)==maxCount){
                ans[index++]=key;
            }
        }
        return Arrays.copyOf(ans,index);
    }

    public void findMode(TreeNode root,Map<Integer,Integer> map){
        if(root==null){
            return;
        }else if(map.containsKey(root.val)){
            int count=map.get(root.val)+1;
            map.put(root.val,count);
            maxCount=Math.max(maxCount,count);
        }else{
            map.put(root.val,1);
        }
        findMode(root.left,map);
        findMode(root.right,map);
    }
}
