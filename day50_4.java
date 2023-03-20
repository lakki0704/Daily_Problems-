class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node node) {
        // Your code here
        
        
        
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        ArrayList<Integer> a= new ArrayList<>();
        a.add(node.data);
        
        int ans = a.size();
        
        while(!q.isEmpty())
        {
            int n= q.size();
            ArrayList<Integer> an= new ArrayList<>();
            for(int i=0; i<n; i++)
            {
                Node temp = q.poll();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                    an.add(temp.left.data);
                }
                
                if(temp.right!=null)
                {
                    q.add(temp.right);
                    an.add(temp.right.data);
                }
                
            }
            
            ans = Math.max(ans, an.size());
            
        }
        
        return ans;
    }
}
