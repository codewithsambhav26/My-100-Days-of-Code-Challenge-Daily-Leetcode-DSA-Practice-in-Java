class Solution {
    public boolean isBipartite(int[][] graph) {
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1; // no color
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){ //BFS
                q.add(i);
                col[i]=0; //yellow
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].length;j++){
                        int edge=graph[curr][j];
                        if(col[edge]==-1){
                            int nextCol=col[curr]==0? 1:0;
                            col[edge]=nextCol;
                            q.add(edge);
                        }else if(col[edge]==col[curr]){
                            return false;//NOT Bipartite
                        }
                    }
                }
            }
        }

        return true;
    }
}
