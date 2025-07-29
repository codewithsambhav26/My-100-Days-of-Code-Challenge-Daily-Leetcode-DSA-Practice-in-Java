class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int rev=0;
        while(n>0){
           int last=n%10; 
           rev=rev*10+last;
           n=n/10;
        }   
        if(rev==x){
            return true;
        }else{
            return false;
        }
    }    
}
