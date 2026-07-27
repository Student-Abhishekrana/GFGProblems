class Solution {
	private static class Pair {
		int currNode;
		int parentNode;
		public Pair(int currNode, int parentNode) {
			this.currNode = currNode;
			this.parentNode = parentNode;
		}
	}
	public boolean isCycle(int V, int[][] edges) {
		// Code here
		// we are going to solve this  by  using bfs
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		boolean[] vis = new boolean[V];
		
		for (int i = 0; i<V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for (int [] edge :edges) {
			int src = edge[0];
			int dest = edge[1];
			
			adj.get(src).add(dest);
			adj.get(dest).add(src);
		}
		
		for (int i = 0; i<V; i++) {
			if (!vis[i] && bfs(adj, vis, i)) {
				return true;
			}
		}
		return false;
		
	}
	
	// bfs function
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int startNode) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(startNode, -1));
		
		vis[startNode] = true;
		
		while (!q.isEmpty()) {
			Pair p = q.remove();
			
			int curr = p.currNode;
			int parr = p.parentNode;
			for (int neighbour : adj.get(curr)) {
				if (!vis[neighbour]) {
					vis[neighbour] = true;
					
					q.add(new Pair(neighbour, curr));
				} else if (neighbour != parr) {
					return true;
				}
				
			}
			
		}
		return false;
		
	}
}
