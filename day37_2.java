//edit distance DP
// Given two strings s and t. Return the minimum number of operations required to convert s to t.
// The possible operations are permitted:

// Insert a character at any position of the string.
// Remove any character from the string.
// Replace any character from the string with any other character.


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        
        if(s.equals(t))
        {
            return 0;
        }
        
        int n = t.length();
        int m = s.length();
        
        int[][] dp = new int[n+1][m+1];
        
        for(int i=0; i<=n; i++)
        {
            dp[i][0]= i;
        }
        for(int i=0; i<=m; i++)
        {
            dp[0][i]= i;
        }
        
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(t.charAt(i-1)==s.charAt(j-1))
                {
                    dp[i][j]= dp[i-1][j-1];
                }
                
                else
                {
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1])) +1;
                }
            }
        }
        
        return dp[n][m];
        
    }
}
 
