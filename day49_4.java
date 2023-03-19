//Check for BST

//User function Template for Java


public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        
        for(int i=0; i<ans.size()-1; i++)
        {
            if(ans.get(i)==ans.get(i+1))
            {
                return false;
            }
        }
        
        ArrayList<Integer> copy_ans = new ArrayList<>(ans);
        Collections.sort(copy_ans);
        
        if(ans.equals(copy_ans))
        {
            return true;
        }
        
        return false;
        
    }
    
    static void inorder(Node root, ArrayList<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
}
