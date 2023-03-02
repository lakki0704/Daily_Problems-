
//User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node reverseBetween(Node head, int m, int n)
    {
        //code here
        Node temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        
        while(temp!=null)
        {
            a.add(temp.data);
            temp=temp.next;
        }
        
        ArrayList<Integer> b = new ArrayList<>();
        int z = a.size();
        
        for(int i=0; i<m-1 && i<z ; i++)
        {
            b.add(a.get(i));
        }
        
        for(int i=n-1; i>=m-1 && i>=0 ; i--)
        {
            b.add(a.get(i));
        }
        
        for(int i=n; i<z; i++)
        {
            b.add(a.get(i));
        }
        
        Node head2 = new Node(-1);
        Node temp2 = head2;
        
        for(int i=0; i<z; i++)
        {
            Node nh = new Node(b.get(i));
            temp2.next = nh;
            temp2 = nh;
        }
        
        return head2.next;
    }
}
