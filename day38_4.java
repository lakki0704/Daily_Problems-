// First non-repeating character in a stream
// Medium
// Participate in Monthly Hiring Challenge conducted by GeeksforGeeks !!  

// Given an input stream of A of n characters consisting only of lower case alphabets. The task is to find the first non repeating character, each time a character is inserted to the stream. If there is no such character then append '#' to the answer

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int[] charcount = new int[26];
        Queue<Character> q = new LinkedList<>();
        String ans = "";
        
        for(int i=0; i<A.length(); i++)
        {
            char ch = A.charAt(i);
            q.add(ch);
            charcount[ch-'a']++;
            
            while(!q.isEmpty() && charcount[q.peek()-'a']>1)
            {
                q.remove();
            }
            
            if(q.isEmpty())
            {
                ans+="#";
            }
            else
            {
                ans+= Character.toString(q.peek());
            }
        }
        
        return ans;
    }
}
