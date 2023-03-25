class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> a = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        st.push(0); //visited[0]=true;
        
        while(!st.isEmpty())
        {
            int curr = st.pop();
            
            if(visited[curr]==false)
            {
                a.add(curr);
                visited[curr]=true;
            }
            
            List<Integer> li=adj.get(curr);

            for(int i=li.size()-1;i>=0;i--){

                if(!visited[li.get(i)])

                st.push(li.get(i));

            }
            
        }
        
        
        return a;
    }
}
