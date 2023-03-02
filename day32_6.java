
//Given a singly linked list: A0→A1→...→An-2→An-1, reorder it to: A0→An-1→A1→An-2→A2→An-3→...
//For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    void reorderlist(Node head) {
        // Your code here
        
        Node temp =head;
        ArrayList<Integer> a = new ArrayList<>();
        
        while(temp!=null)
        {
            a.add(temp.data);
            temp = temp.next;
        }
        
        int i =0;
        int j= a.size()-1;
        int k=0;
        
        ArrayList<Integer> b = new ArrayList<>();
        
        while(i<=j && k<a.size())
        {
            if(k%2==0)
            {
                b.add(a.get(i));
                i++;
                k++;
            }
            else
            {
                b.add(a.get(j));
                j--;
                k++;
            }
            
        }
        
        temp= head;
          
        for(int g=1; g<b.size(); g++)
        {
            Node nh = new Node(b.get(g));
            temp.next = nh;
            temp= nh;
        }
        
        
    }
}
