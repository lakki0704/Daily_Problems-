//Size of binary Tree

/*Complete The Function Below*/
class Tree
{
	public static int getSize(Node root)
	{
//add Code here.
        ArrayList<Integer> a = new ArrayList<>();
        func (root,a);
        
        return a.size();
    }
    
    static void func(Node root, ArrayList<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        
        else
        {
            a.add(1);
        }
        
        func(root.left,a);
        func(root.right,a);
    }
}
