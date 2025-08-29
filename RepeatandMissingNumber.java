class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid.length;
        int arr[]=new int[n+2];
        int arr1[]=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                  arr[grid[i][j]]=arr[grid[i][j]]+1;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                arr1[0]=i;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                arr1[1]=i;
                break;
            }
        }
        
        return arr1;
    }
}
