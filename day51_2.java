
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    static boolean ans = true;
	boolean isSumTree(Node root)
	{
             // Your code here
             ans=true;
             sum(root);

             
             return ans;
	}
	
	
	static int sum(Node root)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    
	     if(root.right==null && root.left==null)
              return root.data;
	    
	    int left = sum(root.left);
	    int right = sum(root.right);
	    if(left+right!=root.data)
	    {
	        ans= false;
	    }
	    
	    return root.data+left+right;
	}
}
