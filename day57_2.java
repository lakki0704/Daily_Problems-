class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          List<Integer> a = new ArrayList<>();
          inorder(root,a);
          
          Node ans = new Node(-1);
          int i=0;
          for(i=0; i<a.size()-1; i++)
          {
              if(a.get(i)==x.data)
              {
                  ans.data = a.get(i+1);
                  break;
              }
          }
          
          if(i<a.size()-1)return ans;
          
          return null;
         }
         
    static void inorder(Node root, List<Integer> a)
    {
        if(root==null) return;
        
        inorder(root.left, a);
        a.add(root.data);
        inorder(root.right,a);
    }
}
