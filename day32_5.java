
class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node temp = head;
        ArrayList<Node> a = new ArrayList<>();
        int index = 0;
        boolean loop = false;
        
        while(temp!=null)
        {
            a.add(temp);
            if(a.contains(temp.next))
            {
                
                index= a.indexOf(temp.next);
                temp.next = null;
                loop =true;
            }
            temp=temp.next;
        }
        
        if(loop)
        {
        return a.size()-index;
            
        }
        
        else
        {
            return 0;
        }
    }
}
