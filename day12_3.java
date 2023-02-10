/*

Given a string S, find the length of the longest substring without repeating characters.


Example 1:

Input:
S = "geeksforgeeks"
Output:
7
Explanation:
Longest substring is
"eksforg".

*/


class Solution{
    int longestUniqueSubsttr(String S){
        
        if(S.length()==0)
        {
            return 0;
        }
        
        
        String sub="";
        sub =sub + S.charAt(0);
        int count = 1;
        
        for(int i=1; i<S.length();i++)
        {
            if(!(sub.contains(Character.toString(S.charAt(i)))))
            {
                sub = sub + S.charAt(i);
                count = Math.max(count, sub.length());
            }
            
            else
            {
                sub = sub.substring(sub.indexOf(Character.toString(S.charAt(i))) + 1);
                sub = sub + S.charAt(i);
            }
        }
        
        return count;
        
    }
}
