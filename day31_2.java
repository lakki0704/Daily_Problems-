/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	
	Node temp = root;
	ArrayList<Integer> a = new ArrayList<>();
	
	while(temp!=null)
	{
	    Node t = temp;
	    while(t!=null)
	    {
	        a.add(t.data);
	        t=t.bottom;
	    }
	    
	    temp=temp.next;
	}
	
	
	Collections.sort(a);
	Node head = new Node(-1);
	Node tem = head;
	
	for(int i=0; i<a.size(); i++)
	{
	    Node nh = new Node(a.get(i));
	    tem.bottom= nh;
	    tem = nh;
    }
    
    return head.bottom;
}
}
