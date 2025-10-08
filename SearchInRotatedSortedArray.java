class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }

    public static int helper(int nums[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid =si+(ei-si)/2;
        if(nums[mid]==tar){
            return mid;
        }
        if(nums[si]<=nums[mid]){
            if(nums[si]<=tar && tar<= nums[mid]){
                return helper(nums, tar, si, mid-1);
            }else{
                return helper(nums, tar, mid+1, ei);
            }
        }
        else{
            if(nums[mid]<=tar && tar<=nums[ei]){
                return helper(nums, tar, mid+1, ei);
            }else{
                return helper(nums, tar, si, mid-1);
            }
        }
    }
}
