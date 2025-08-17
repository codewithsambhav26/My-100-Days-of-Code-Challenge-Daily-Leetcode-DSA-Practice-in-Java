class Solution {
    public int largestRectangleArea(int[] heights) {
        //Next Smaller Left
        Stack<Integer>s =new Stack<>();
        int nsl[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //Next Smaller Right
        s =new Stack<>();
        int nsr[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=heights.length; //n
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Curr Area
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int currArea=heights[i]*(nsr[i]-nsl[i]-1);
            maxArea=Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
