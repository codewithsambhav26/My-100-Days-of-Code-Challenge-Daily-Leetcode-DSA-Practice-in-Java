class Solution {
    public boolean isPerfectSquare(int num) {
        int si=1;
        int ei=num;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            long mid_square=(long) mid * mid;
            if(mid_square==num){
                return true;
            }
            else if(mid_square>num){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return false;
    }
}
