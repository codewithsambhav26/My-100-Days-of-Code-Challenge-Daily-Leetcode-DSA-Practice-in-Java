class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s=new Stack<>();
        int nxtGreater[]=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums[i % nums.length]){
                s.pop();
            }
            if(i<nums.length){
               if(s.isEmpty()){
                  nxtGreater[i]=-1;
               }else{
                  nxtGreater[i]=s.peek();
               }
            }
            s.push(nums[i % nums.length]);
        }
        return nxtGreater;
    }
}
