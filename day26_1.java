// Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with its own memory the original lists should not be changed.
// Note: The linked list elements are not necessarily distinct.

// Example 1:

// Input:
// L1 = 1->2->3->4->6
// L2 = 2->4->6->8
// Output: 2 4 6
// Explanation: For the given first two
// linked list, 2, 4 and 6 are the elements
// in the intersection.




/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp1= head1;
        Node temp2 = head2;
        
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data == temp2.data)
            {
                ans.add(temp1.data);
                temp1= temp1.next;
                temp2=temp2.next;
            }
            
            else if(temp1.data< temp2.data)
            {
                temp1 = temp1.next;
            }
            else
            {
                temp2 = temp2.next;
            }
        }
        
        Collections.reverse(ans);
        Node head3 = null;
        
        for(int i=0; i<ans.size(); i++)
        {
            Node nodenew = new Node(ans.get(i));
            nodenew.next = head3;
            head3= nodenew;
        }
        
        return head3;
    }
}
