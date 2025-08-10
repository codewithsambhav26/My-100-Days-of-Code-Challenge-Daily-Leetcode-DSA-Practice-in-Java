class Solution {
    class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int w) {
            this.src = src;
            this.dest = dest;
            this.wt = w;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        ArrayList<Edge> graph[]=new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }

        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];

            boolean[] vis =new boolean[n+1];
            if(detectCycleUtil(graph,vis,u,v)){
                return edge;
            }

            graph[u].add(new Edge(u,v,1));
            graph[v].add(new Edge(v,u,1));
        }
        return new int[]{};
    }

    private boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[],int curr,int target){
        if(curr==target){
            return true;
        }
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //case 3
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest,target)){
                    return true;
                }
            }
        }
        return false;
    }
}
