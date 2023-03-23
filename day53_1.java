class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        
        st.add(root);
        
        while(!st.isEmpty())
        {
            Node curr = st.pop();
            if(curr.right!=null)
            {
                st.add(curr.right);
            }
            
            if(curr.left!=null)
            {
                st.add(curr.left);
            }
            
            ans.add(curr.data);
        }
        
        return ans;
    }
    
    
}
