class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        first = reverseList(first);
        second = reverseList(second);        
        Node dummy = new Node(-1);
        Node temp = dummy;
        int carry = 0;        
        while (first != null || second != null || carry == 1){
            int sum = 0;
            
            if (first != null){
                sum += first.data;
                first = first.next;
            }
            if (second != null){
                sum += second.data;
                second = second.next;
            }
            sum += carry;
            carry = sum/10;           
            Node newnode = new Node(sum%10);
            temp.next = newnode;
            temp = temp.next;
        }        
        return reverseList(dummy.next);
    }
    
    public static Node reverseList(Node head)
    {
        ArrayList<Integer> a = new ArrayList<>();
        Node temp = head ;
        while(temp!=null)
        {
            a.add(temp.data);
            temp=temp.next;
        }
        Collections.reverse(a);
        Node head1 = new Node(-1);
        Node temp1 = head1;
        
        for(int i=0; i<a.size(); i++)
        {
            Node nh = new Node(a.get(i));
            temp1.next = nh;
            temp1 = nh;
        }
        
        return head1.next;
    }
}
