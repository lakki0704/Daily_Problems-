class Level_Order_Traverse
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);
        ArrayList<Integer> a= new ArrayList<>();
        a.add(node.data);
        ans.add(a);
        
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
            
            if(!an.isEmpty())
            {
                ans.add(an);
            }
            
        }
        
        return ans;
    }
}
