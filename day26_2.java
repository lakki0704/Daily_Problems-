//union of two linkedlist


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    ArrayList<Integer> union = new ArrayList<>();
	    
	    Node temp1= head1;
	    Node temp2=head2;
	    
	    
	    while(temp1!= null)
	    {
	        if(!union.contains(temp1.data))
	        {
	            union.add(temp1.data);
	            
	        }
	        
	        temp1=temp1.next;
	       
	    }
	    
	    while(temp2!=null)
	    {
	        if(!union.contains(temp2.data))
	        {
	            union.add(temp2.data);
	        }
	         temp2=temp2.next;
	    }
	    
	    Node head3= null;
	   Collections.sort(union);
	   Collections.reverse(union);
	    
	    for(int i=0; i<union.size();i++)
	    {
	        Node node = new Node(union.get(i));
	        node.next = head3;
	        head3 = node;
	    }
	    
	    return head3;
	}
}
