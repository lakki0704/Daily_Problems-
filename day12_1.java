/*

Bob is very fond of balloons. Once he visited an amusement park with his mother. The mother told Bob that she would buy him a balloon only if he answer her problem right. She gave Bob a string S [contains only lowercase characters] and asked him to use the characters of string to form as many instances of the word "balloon" as possible. Return the maximum number of instances that can be formed.

Help Bob to solve the problem.

Note: You can use each character in the string at most once.

Example 1:

Input:
S: nlaebolko
Output: 1
Explanation:
Here, the number of occurence of 'b' = 1
of occurence of 'a' = 1
of occurence of 'l' = 2
of occurence of 'o' = 2
of occurence of 'n' = 1
So, we can form 1 "balloon" using the letters.

*/



// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        
        String b = "balloon";
        int n = b.length();
        
        int x = s.length()/n;
        
        if(x==0)
        {
            return 0;
            
        }
        
        int count = 0;
        
        int i=1;
        
        while(i<=x)
        
        {
            int j;
            for(j=0; j<n; j++)
            {
                if(map.containsKey(b.charAt(j)))
                {
                    map.put(b.charAt(j), map.get(b.charAt(j))-1);
                    if(map.get(b.charAt(j))==0)
                    {
                        map.remove(b.charAt(j));
                    }
                }
                else
                {
                    break;
                }
            }
            
            if(j==n)
            {
                count++;
                i++;
            }
            else
            {
                return count;
            }
        }
        
        return count;
        
    }
}
