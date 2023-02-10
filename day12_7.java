class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String a, String b)
    {
        // Your code here
        
        if(a.length()!=b.length())
        {
            return false;
        }
        
        
        if(a.length()==1)
    {
        if(a.charAt(0)==b.charAt(0))
        {
            return true;
        }
        
        return false;
    }
    
    
    if(a.length()==2)
    {
        if(a.charAt(0)==b.charAt(1) && a.charAt(1)==b.charAt(0))
        {
            return true;
        }
        
        return false;
    }
        
        
        
        String s1 = a.substring(2)+ Character.toString(a.charAt(0)) + Character.toString(a.charAt(1));
        String s2 = Character.toString(a.charAt(a.length()-2)) + Character.toString(a.charAt(a.length()-1))+ a.substring(0,a.length()-2);
        
        if(s1.equals(b) || s2.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}




// Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

// Example 1:

// Input:
// a = amazon
// b = azonam
// Output: 1
// Explanation: amazon can be rotated anti
// clockwise by two places, which will make
// it as azonam.
// Example 2:

// Input:
// a = geeksforgeeks
// b = geeksgeeksfor
// Output: 0
// Explanation: If we rotate geeksforgeeks by
// two place in any direction , we won't get
// geeksgeeksfor.
