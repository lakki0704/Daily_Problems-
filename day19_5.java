class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        
        
        for(int i=0; i< str.length() ;i++)
        {
            if(patt.contains(Character.toString(str.charAt(i))))
            {
                return i;
            }
        }
         
         return -1;   
            
    }
