class Solution {
    public long countSub(String str) {
        // Your code goes here 
        
        
        int open=0,close=0;
        for(int i=0;i<str.length();i++)
        {
        if(str.charAt(i)=='(')
        open++;
        }
        if(open==0)
        {
        return str.length();
        }
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='(')
            open--;
            if(str.charAt(i)==')')
            close++;
            if(open==close)
            return i;
        }
        
        return 0;
    }
}

// Given a string S of opening and closing brackets '(' and ')' only. The task is to find an equal point. An equal point is an index such that the number of closing brackets on right from that point must be equal to number of opening brackets before that point.


// Example 1:

// Input: str = "(())))("
// Output: 4
// Explanation:
// After index 4, string splits into (())
// and ))(. Number of opening brackets in the
// first part is equal to number of closing
// brackets in the second part.
