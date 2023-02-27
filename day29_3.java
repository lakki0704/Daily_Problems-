


class Solution
{
    public static Node reverse(Node node, int k)
    { //Your code here
        Node temp = node;
        Node head = new Node(-1);
        Node t1 = head;
        while(temp!=null)
        {
            int i=0;
            ArrayList<Integer> a = new ArrayList<>();
            
            while(temp!=null && i<k)
            {
                a.add(temp.data);
                temp=temp.next;
                i++;
            }
            
            Collections.reverse(a);
            
            
            for(int j=0; j<a.size(); j++)
            {
                Node b = new Node(a.get(j));
                t1.next =b;
                t1=b;
            }
        }    
        return head.next;
    }
}

