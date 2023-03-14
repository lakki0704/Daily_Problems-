//pre order traversal of a tree

//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        printans(root,ans);
        return ans;
    }
    
    static void printans(Node root, ArrayList<Integer> ans)
    {
        if(root!=null)
        {
            ans.add(root.data);
            printans(root.left, ans);
            printans(root.right,ans);
        }
    }

}
