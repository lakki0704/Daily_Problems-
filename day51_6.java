//User function Template for Java

/*  A Binary Tree nodea
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
class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        traverse(node,ans);
        Collections.sort(ans);
        
        if(ans.isEmpty())
        {
            ans.add(-1);
            return ans;
        }
        return ans;
    }
    
    static void traverse(Node root, ArrayList<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.left==null && root.right!=null)
        {
            a.add(root.right.data);
        }
        
        if(root.left!=null && root.right==null)
        {
            a.add(root.left.data);
        }
        
        traverse(root.left,a);
        traverse(root.right,a);
    }
}
