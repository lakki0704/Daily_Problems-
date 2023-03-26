
class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if(root==null) return null;
        Node near = search(root,Key);
        if(near.data==Key) return root;
        
        if(near.data> Key) 
        {
            Node n = new Node(Key);
            near.left = n;
            return root;
        }
        
        Node n = new Node(Key);
        near.right =n;
        return root;
        
        
    }
    
    static Node search(Node root, int key)
    {
        
        if(root.data==key) return root;
        if(root.data> key)
        {
            if(root.left!=null)
            {
            return search(root.left,key);
            }
            else
            {
                return root;
            }
        }
        
        if(root.right!=null)
        {
            return search(root.right,key);
            
        }
        else
        {
            return root;
        }
        
        
    }
}
