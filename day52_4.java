//User function Template for Java

class Solution
{
    public static void flatten(Node root)
    {
        //code here
        ArrayList<Integer> a = new ArrayList<>();
        preorder(root, a);
        
        Node temp = root;
        temp.left=null;
        
        for(int i=1; i<a.size();i++)
        {
            Node curr = new Node(a.get(i));
            curr.left =null;
            temp.right = curr;
            temp = curr;

        }
    }
    
    static void preorder(Node root, ArrayList<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        a.add(root.data);
        preorder(root.left,a);
        preorder(root.right,a);
    }
}
