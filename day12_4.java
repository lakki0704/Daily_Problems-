/*
Given a string str. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.

*/


class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        // String[] str = line.split("");
        // ArrayList<String> a = new ArrayList<String>(Arrays.asList(str));
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<line.length(); i++)
        {
            if(map.containsKey(line.charAt(i)))
            {
                map.put(line.charAt(i), map.get(line.charAt(i))+1);
            }
            else
            {
                map.put(line.charAt(i),1);
            }
        }
        
        int length =0;
        char c = '-';
        
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>length)
            {
                length = entry.getValue();
                c = entry.getKey();
            }
            else if(entry.getValue() == length)
            {
                if(entry.getKey()<c)
                {
                    c= entry.getKey();
                }
            }
        }
        
        return c;
    }
    
}
