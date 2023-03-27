class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.
        if(root==null) return root;
        
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        search(root,n1,a1);
        search(root,n2,a2);
        
         Node ans = new Node(-1);
         for(int i=0; i<a1.size();i++)
         {
             if(a2.contains(a1.get(i)))
             {
                 ans.data = a1.get(i);
                 //break;
             }
         }
        
        
       
        return ans;
        
        
    }
    
    
    static void search(Node root, int n , ArrayList<Integer> a)
    {
        if(root.data>n)
        {
            a.add(root.data);
            search(root.left,n,a);
        }
        else if(root.data<n)
        {
            a.add(root.data);
            search(root.right,n,a);
        }
        else
        {
            a.add(root.data);
            return;
        }
    }
    
}
