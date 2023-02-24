//intersection of 2 linkedlist

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        
        HashSet<Integer> map = new HashSet<>();
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp2!=null)
        {
            map.add(temp2.data);
            temp2 =temp2.next;
        }
        
        Node head3= new Node(-1);
        Node h = head3;
        
        while(temp1!=null)
        {
            if(map.contains(temp1.data)){
            h.next = new Node(temp1.data);
            h = h.next;
            }
            
            temp1= temp1.next;
        }
        
        return head3.next;
    }
}
