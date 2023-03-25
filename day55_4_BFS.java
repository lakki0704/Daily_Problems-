class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> a = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        
        q.offer(0);
        visited[0]=true;
        
        while(!q.isEmpty())
        {
            int s = q.poll();
            a.add(s);
            
            for(int i: adj.get(s))
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        
        return a;
        
    }
}
