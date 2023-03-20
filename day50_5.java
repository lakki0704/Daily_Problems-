/* 
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
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ans.add(root.data);
        
        while(!q.isEmpty())
        {
            for(int i=0; i<q.size(); i++)
            {
                Node curr = q.poll();
                if(curr.right!=null)
                {
                    q.add(curr.right);
                    ans.add(curr.right.data);
                }
                if(curr.left!=null)
                {
                    q.add(curr.left);
                    ans.add(curr.left.data);
                }
                
                
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
}      
