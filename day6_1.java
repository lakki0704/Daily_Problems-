class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int n = S.length();
        ArrayList<String> str = new ArrayList<>();
        String st ="";
        
        for(int i=0; i<=n; i++)
        {
            if(i==n)
            {
                str.add(st);
            }
            else if(S.charAt(i)!='.')
            {
                st= st+S.charAt(i);
            }
            else
            {
                str.add(st);
                st="";
            }
        }
        
        String ans = "";
        for(int i=str.size()-1 ; i>=0; i--)
        {
            if(i==0)
            {
                ans = ans + str.get(i);
            }
            else
            {
                ans = ans + str.get(i)+".";
            }
            
            
        }
        
        return ans;
        
    }
}


/*

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

*/
