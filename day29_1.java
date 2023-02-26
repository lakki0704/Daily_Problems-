// Given a linked list and a number k. You have to reverse first part of linked list with k nodes and the second part with n-k nodes.

/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node reverse(Node head, int p) {
        // code here
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        Node temp =head;
        
        int count =0;
        while(temp!=null && count<p)
        {
            s1.add(temp.data);
            temp =temp.next;
            count++;
        }
        
        while(temp!=null)
        {
            s2.add(temp.data);
            count++;
            temp=temp.next;
        }
        
        Collections.reverse(s1);
        Collections.reverse(s2);
        
        Node head2 = new Node(-1);
        Node tem = head2;
        
        for(int i=0;i<s1.size(); i++)
        {
            Node k = new Node(s1.get(i));
            tem.next = k;
            tem=k;
        }
        
        for(int i=0;i<s2.size(); i++)
        {
            Node k = new Node(s2.get(i));
            tem.next = k;
            tem=k;
        }
        
        return head2.next;
    }
}
        
