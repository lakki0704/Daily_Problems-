


//User function Template for Java

/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        
       Node curr = root;
        
        while(!st.isEmpty() || curr!=null)
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            
            else
            {
                curr = st.pop();
                a.add(curr.data);
                curr =curr.right;
            }
        }
        
        return a;
    }
    
    
}
