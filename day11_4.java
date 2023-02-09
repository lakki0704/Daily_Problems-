class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        int i=0;
        int j=0,k=0;
        
        String ans ="";
        
        while(i<S1.length() && j<S2.length())
        {
            if(k%2==0)
            {
                ans= ans+S1.charAt(i);
                i++;
                k++;
                continue;
            }
            else
            {
                ans = ans + S2.charAt(j);
                j++;
                k++;
            }
        }
        
        if(i!=S1.length())
        {
            ans = ans + S1.substring(i);
        }
        else if(j!=S2.length())
        {
            ans = ans + S2.substring(j);
        }
        
        return ans;
    }
} 

/*

Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.
NOTE: Add the whole string if other string is empty.

Example 1:

Input:
S1 = "Hello" S2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the 
given strings are arranged alternatlively.


*/
