/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        
        //reverse the list
        if(head==null)
        {
            return null;
        }
        Node prev = null;
        Node next = null;
        Node curr = head;
        
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        //add one 1 reverse list

        int carry=0;

        Node temp=head;

        int num=temp.data+1;

       int rem=num%10;

        carry=num/10;

        temp.data=rem;

        temp=temp.next;

        while(temp!=null)

        {

             num=temp.data+carry;

             rem=num%10;

            carry=num/10;

            temp.data=rem;

            temp=temp.next;

        }

         prev=null;

         next=null;

         curr=head;

        while(curr!=null)

        {

            next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;

        }

        head=prev;

        //if carry is 1 add a node in front of list

          if(carry==1)

        {

            Node newnode= new Node(carry);

            newnode.next=head;

            head=newnode;

        }

        

        return head;
    }
}
