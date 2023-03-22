// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        if(root==null)
        {
            return 0;
        }
        
        int dl = diameter(root.left);
        int dr= diameter(root.right);
        int curr = height(root.left)+height(root.right)+1;
        
        return Math.max(curr, Math.max(dl,dr));
    }
    
    static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        return Math.max(height(root.left) , height(root.right))+1;
    }
}
