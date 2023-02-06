class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char c ='$';
        ArrayList<Character> str = new ArrayList<>();
        ArrayList<Character> str2 = new ArrayList<>(); //for storing repeating values
        for(int i=0; i<S.length(); i++)
        {
            if(!(str.contains(S.charAt(i))))
            {
                str.add(S.charAt(i));
            }
            else
            {
                str2.add(S.charAt(i));
            }
        }
        
        for(int i=0; i<S.length(); i++)
        {
            if(!(str2.contains(S.charAt(i))))
            {
                c = S.charAt(i);
                break;
            }
        }
        
        return c;
    }
}


//first non repeating character in the string
