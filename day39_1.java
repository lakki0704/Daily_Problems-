//find anagrams in a linkedlist
// a linked list of characters and a string S.Return all the anagrams of the string present in the given linked list.
//In case of overlapping anagrams choose the first anagram from left.


// User function Template for Java
/*

Definition for singly Link List Node
class Node
{
    char data;
    Node next;

    Node(char x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        // code here
        
        ArrayList<Node> a = new ArrayList<>();
        Node prev = head;
        Node curr = head;
        
        int arr[]=new int[26];

        for(int i=0; i<s.length(); i++)arr[s.charAt(i)-'a']++;
        int j=0;
        int n= s.length();
    
        
        while(curr!=null)
        {
            int[] arr2 = new int[26];
            while(j<n && curr!=null)
            {
                arr2[curr.data-'a']++;
                curr=curr.next;
                j++;
            }
            boolean ana = true;
            
            for(int i=0; i<26; i++)
            {
                if(arr[i]!=arr2[i])
                {
                    ana = false;
                    break;
                }
            }
            
            if(ana==false)
            {
                curr=prev.next;
                prev = curr ;
                j=0;
                continue;
            }
            else 
            {
                
                Node nh = new Node('x');
                Node temp = nh;
                while(j>0)
                {
                    Node nh2 = new Node(prev.data);
                    prev=prev.next;
                    temp.next =nh2;
                    temp = nh2;
                    j--;
                }
                a.add(nh.next);
                curr = prev;
            }
        }
        
        return a;
    }
}
