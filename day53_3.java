// User function Template for Java

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
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
    Stack<Node> st = new Stack<>();
    ArrayList<Integer> ans = new ArrayList<>();
    st.push(node);
    Node curr= node;
    
    while(!st.isEmpty())
    {
        curr= st.pop();
        ans.add(curr.data);
        if(curr.left!=null)
        {
            st.push(curr.left);
        }
        
        if(curr.right!=null)
        {
           st.push(curr.right);
        }
    }
    
    Collections.reverse(ans);
    
    return ans;
    
    }
}
