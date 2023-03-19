//Inorder Traversal of Tree

// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        
        return ans;
    }
    
    
    static void inorder(Node root, ArrayList<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right,ans);
        
    }
}
