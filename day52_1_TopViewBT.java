//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/


class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        
        q.add(new Pair(0,root));
        
        while(!q.isEmpty())
        {
            
           Pair curr = q.poll();
            
           if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null)
            {
                q.add(new Pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right!=null)
            {
                q.add(new Pair(curr.hd+1, curr.node.right));
            }
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            ans.add(entry.getValue());
        }
        
        return ans;
    }
    
   static class Pair
    {
        int hd;
        Node node;
        public Pair(int hd, Node node)
        {
            this.node = node;
            this.hd= hd;
        }
    }
}
