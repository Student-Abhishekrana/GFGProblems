class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        
        
        int indegree[] = new int[V];
        
        //calculate indegree for each elements
        for(int i=0; i<edges.length; i++){
            int src =edges[i][0];
            int dest= edges[i][1];
            
            adj.get(src).add(dest);
            indegree[dest]++;
            
        }
        
        //now we have use the bfs approach here to detect cycle
        Queue<Integer> q =new LinkedList<>();
        
        //run a loop for to add first elements into queue
        for(int i=0; i<V; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        ////now check for cycle
        int count=0;
        
        while(!q.isEmpty()){
            int curr =q.remove();
            count++;
            
            for(int conn : adj.get(curr)){
                indegree[conn]--;
                if(indegree[conn]==0){
                    q.add(conn);
                }
            }
            
        }
        
        if(count==V){
            return false;
        }
        return true;
    }
}