


//User function Template for Java


/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	 if(root==null)
	 {
	     return true;
	 }
	 
	 if(Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.right) && isBalanced(root.left))
{
    return true;
}

return false;
	 
    }
    
    static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
        return Math.max(height(root.left), height(root.right))+1;
    }
}

