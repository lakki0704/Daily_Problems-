/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int p) {
        // add code here
        int n =1;
        Node temp =head;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        while(temp!=null && n<=p)
        {
            a1.add(temp.data);
            temp=temp.next;
            n++;
        }
        
        while(temp!=null)
        {
            a2.add(temp.data);
            temp=temp.next;
        }
        
        Node head1 = new Node(-1);
        Node temp1 = head1;
        
        for(int i=0; i<a2.size(); i++)
        {
            Node k = new Node(a2.get(i));
            temp1.next =k;
            temp1=k;
        }
        for(int i=0; i<a1.size(); i++)
        {
            Node k = new Node(a1.get(i));
            temp1.next =k;
            temp1=k;
        }
        
        return head1.next;
    }
}
