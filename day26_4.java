//reverse a linked list

/function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node head2= new Node(head.data);
        head2.next =null;
        
        Node temp = head2;
        head=head.next;
       
        
        while(head!=null)
        {
            Node noew = new Node(head.data);
            noew.next = temp;
            temp = noew;
            
            head = head.next;
        }
        
        return temp;
    }
}
