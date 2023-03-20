


//User function Template for Java


/*
// A Binary Tree node
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

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Node> q= new LinkedList<>();
        int level=0;
        q.add(root);
        if(root==null)
        {
            return ans;
        }
        
        ans.add(root.data);
        
        while(!q.isEmpty())
        {
            level++;
            int n = q.size();
            
            for(int i=0; i<n ; i++)
            {
                
                if(level%2!=0)
                {
                    Node curr = q.poll();
                    if(curr.left!=null)
                    {
                        q.add(curr.left);
                        ans.add(curr.left.data);
                    }
                    if(curr.right!=null)
                    {
                        q.add(curr.right);
                        ans.add(curr.right.data);
                    }
                }
                
                else
                {
                    Node curr = q.removeLast();
                    if(curr.right!=null)
                    {
                        q.addFirst(curr.right);
                        ans.add(curr.right.data);
                    }
                    if(curr.left!=null)
                    {
                        q.addFirst(curr.left);
                        ans.add(curr.left.data);
                    }
                }
            }
        }
        
        return ans;
    }
}
