class Solution
{
    static boolean[][] visited;
    public boolean isWordExist(char[][] b, String word)
    {
        // Code here
        visited = new boolean[b.length][b[0].length];
        for(int i=0; i<b.length; i++)
        {
            for(int j =0; j<b[0].length; j++)
            {
                if(b[i][j]==word.charAt(0) && search(b,word, i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean search(char[][] board , String word, int i, int j, int idx)
    {
        if(idx==word.length())
        {
            return true;
        }
        if(i>=board.length || i<0 || j>=board[0].length || j<0 || word.charAt(idx)!=board[i][j] || visited[i][j])
        {
            return false;
        }
        
        visited[i][j] = true;
        if(search(board,word,i-1,j,idx+1) || search(board,word,i+1,j,idx+1) || search(board,word, i,j-1,idx+1) || search(board,word,i,j+1,idx+1))
    
        {
            return true;
        }
        
        visited[i][j]=false;
        return false;
    }
}


/*
Given a 2D board of letters and a word. Check if the word exists in the board. The word can be constructed from letters of adjacent cells only. ie - horizontal or vertical neighbors. The same letter cell can not be used more than once.
 

Example 1:

Input: board = {{a,g,b,c},{q,e,e,l},{g,b,k,s}},
word = "geeks"
Output: 1
Explanation: The board is-
a g b c
q e e l
g b k s
The letters which are used to make the
"geeks" are colored.

*/
