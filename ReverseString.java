class Solution {
    public void reverseString(char[] s){
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length;i++){
            stck.push(s[i]);
        }

        for (int i =0;i<s.length;i++){
            s[i]=stck.pop();
        }
    }
}
