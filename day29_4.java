//Merge two sorted linkedlist

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     
     Node temp1 = head1;
     Node temp2 = head2;
     
     ArrayList<Integer> a = new ArrayList<>();
     
     while(temp1!=null)
     {
         a.add(temp1.data);
         temp1=temp1.next;
     }
     while(temp2!=null)
     {
         a.add(temp2.data);
         temp2=temp2.next;
     }
     
     Collections.sort(a);
     
     Node head = new Node(-1);
     Node t1 = head;
     
     for(int j=0; j<a.size(); j++)
    {
                Node b = new Node(a.get(j));
                t1.next =b;
                t1=b;
    }
    
    return head.next;
     
   } 
}
