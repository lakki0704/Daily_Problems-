
/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node temp = head;
	    ArrayList<Integer> a = new ArrayList<>();
	    
	    while(temp!=null)
	    {
	        a.add(temp.data);
	        temp=temp.next;
	    }
	    
	    for(int i=0; i<a.size(); i++)
	    {
	        for(int j=i+1; j<a.size(); j++)
	        {
	            if(a.get(i)<a.get(j))
	            {
	                a.remove(i);
	                i=i-1;
	                break;
	            }
	        }
	    }
	    
	    Node head2 = new Node(-1);
	    Node temp2 = head2;
	    
	    for(int i=0; i<a.size(); i++)
	    {
	        Node nh = new Node(a.get(i));
	        temp2.next = nh;
	        temp2 = nh;
	    }
	    
	    
	    return head2.next;
    }
}
  
