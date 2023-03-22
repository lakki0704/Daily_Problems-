class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	   ArrayList<Integer> a = new ArrayList<>();
	   inorder(root,a);
	   
	   Node head = new Node(a.get(0));
	   Node temp = head;
	   Node prev = head;
	   
	   for(int i=1; i<a.size(); i++)
	   {
	       Node curr = new Node(a.get(i));
	       curr.left = prev;
	       temp.right = curr;
	       temp =curr;
	       prev= curr;
	   }
	   
	   return head;
    }
    
    static void inorder(Node root, ArrayList<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,a);
        a.add(root.data);
        inorder(root.right,a);
    }
}
