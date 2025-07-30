class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //opening bracket
            if(ch=='('|| ch=='{' || ch=='['){
                stck.push(ch);
            }else{
                //closing bracket
                if(stck.isEmpty()){
                    return false;
                }
                if(stck.peek()=='(' && ch==')'
                || stck.peek()=='{' && ch=='}'
                || stck.peek()=='[' && ch==']'){
                    stck.pop();
                }else{
                    return false;
                }
            }
        }
        if(stck.isEmpty()){
            return true;
        }else{
            return false;
        }        
    }
}
