
/*
Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.

*/

class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String str ="";
        
        for(int i=0; i<s1.length(); i++)
        {
            if(!(s2.contains(Character.toString(s1.charAt(i)))))
            {
               str = str + Character.toString(s1.charAt(i));
            }
        }
        
        for(int i=0; i<s2.length(); i++)
        {
            if(!(s1.contains(Character.toString(s2.charAt(i)))))
            {
               str = str + Character.toString(s2.charAt(i));
            }
        }
        
        if(str.isEmpty())
        {
            return "-1";
        }
      
        
        return str;
    }
}
