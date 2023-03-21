


/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/


class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    ArrayList<Integer> tree1 = new ArrayList<>();
	    ArrayList<Integer> tree2 = new ArrayList<>();
	    
	    preorder(root1,tree1);
	    preorder(root2,tree2);
	    
	    ArrayList<Integer> tree3 = new ArrayList<>();
	    ArrayList<Integer> tree4 = new ArrayList<>();
	    
	    inorder(root1,tree1);
	    inorder(root2,tree2);
	    
	    if(tree1.equals(tree2) && tree3.equals(tree4))
	    {
	        return true;
	    }
	    
	    return false;
	    
	}
	
	static void preorder(Node root, ArrayList<Integer> a)
	{
	    if(root==null)
	    {
	        return;
	    }
	    
	    preorder(root.left, a);
	    a.add(root.data);
	    preorder(root.right,a);
	}
	
	static void inorder(Node root, ArrayList<Integer> a)
	{
	    if(root==null)
	    {
	        return;
	    }
	    
	    a.add(root.data);
	    preorder(root.left, a);
	    preorder(root.right,a);
	}
	
}
