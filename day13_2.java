//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        // code here
        
        String binary = Long.toBinaryString(X);
        String padding = String.format("%32s", binary).replace(' ', '0');
        String str ="";
        for(int i=padding.length()-1;i>=0; i--)
        {
            str=str+Character.toString(padding.charAt(i));
        }
        
        Long ans = Long.parseLong(str,2);
        return ans;
        
    }
};


/*

Given a 32 bit number X, reverse its binary form and print the answer in decimal.

Example 1:

Input:
X = 1
Output:
2147483648 
Explanation:
Binary of 1 in 32 bits representation-
00000000000000000000000000000001
Reversing the binary form we get, 
10000000000000000000000000000000,
whose decimal value is 2147483648.


*/
