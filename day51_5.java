class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer> a = new ArrayList<>();
        preorder(root, a);
        
        Collections.sort(a);
        
        if(K<0 || K>=a.size())
        {
            return -1;
        }
        
        return a.get(a.size()-K);
    }
    
    static void preorder(Node root, ArrayList<Integer> a)
    {
        if(root==null)
        {
            a.add(-1);
            return;
        }
        
        a.add(root.data);
        preorder(root.left, a);
        preorder(root.right,a);
    }
}
