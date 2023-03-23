
/*
class of the node of the tree is as
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
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if(root==null) return true;

        return checkMirror(root.left,root.right);

    }

    public static boolean checkMirror(Node root1, Node root2){

        if(root1==null || root2==null) return (root1==root2);

        return(root1.data==root2.data && checkMirror(root1.left, root2.right) && checkMirror(root1.right, root2.left));

    }
}
