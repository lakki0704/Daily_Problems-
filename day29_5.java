

class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        ArrayList<Integer> a =new ArrayList<>();
        
        for(int i=0; i<K; i++)
        {
            Node t1 = arr[i];
            while(t1!=null)
            {
                a.add(t1.data);
                t1=t1.next;
            }
        }
        
        Collections.sort(a);
        Node head = new Node(-1);
        Node temp = head;
        
        for(int i=0; i<a.size(); i++)
        {
            Node m = new Node(a.get(i));
            temp.next =m;
            temp=m;
        }
        
        
        return head.next;
    }
}
