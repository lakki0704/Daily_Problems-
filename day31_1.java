//remove a loop in linkedlist

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node temp = head;
        HashSet<Node> h = new HashSet<>();
        
        while(temp!=null)
        {
            h.add(temp);
            if(temp.next!=null && h.contains(temp.next))
            {
                temp.next = null;
            }
            temp = temp.next;
        }
    }
}
