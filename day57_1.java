class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null) return null;
        
        if(root.data>X)
        {
            root.left= deleteNode(root.left,X);
        }
        else if(root.data<X)
        {
            root.right= deleteNode(root.right,X);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
            
            else
            {
                root.data = min(root.right);
                root.right= deleteNode(root.right,root.data);
            }
           // return root;
        }
        
        
        return root;
    }
    
    static int min(Node root)
    {
        //int min = Integer.MAX_VALUE;
        if(root.left!=null)
        {
            root=root.left;
        }
        
        return root.data;
    }
}
