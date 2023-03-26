class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        ArrayList<Integer> a = new ArrayList<>();
        preorder(root,a);
        
        Collections.sort(a);
        
        if(K>a.size())
        {
            return -1;
        }
        
        return a.get(K-1);
    }
    
    static void preorder(Node root, ArrayList<Integer> a)
    {
        if(root==null)return;
        
        a.add(root.data);
        preorder(root.left,a);
        preorder(root.right,a);
    }
}
