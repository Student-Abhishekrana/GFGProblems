class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        int n=adj.size();
        boolean[] isvisited= new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!isvisited[i]){
                bfsUtil(adj,i,isvisited,ans);
            }
        }
        return ans;
    }
    
    public static void bfsUtil(ArrayList<ArrayList<Integer>> adj, int start,boolean[] isvisited, ArrayList<Integer> ans){
       
        Queue<Integer> q =new LinkedList<>();
        q.add(start);
        isvisited[start]=true;
        
        
        while(!q.isEmpty()){
            int curr =q.poll();
            ans.add(curr);
            for(int neighbour :adj.get(curr)){
                if(!isvisited[neighbour]){
                    q.add(neighbour);
                    isvisited[neighbour] =true;
                }
            }
        }
        
        
    }
}