class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        int n =adj.size();
        boolean visited[] =new boolean[n];
        
        for(int curr=0; curr<n; curr++){
            if(!visited[curr]){
                dfsUtil(adj,curr,ans,visited);
            }
        }
        
        
      return ans;
    }
    public static void dfsUtil(ArrayList<ArrayList<Integer>> adj,int curr, ArrayList<Integer>ans, boolean[] visited){
        
        visited[curr] =true;
        ans.add(curr);
        
        for(int neighbour: adj.get(curr)){
            if(!visited[neighbour]){
                dfsUtil(adj,neighbour,ans,visited);
            }
        }
    }
}