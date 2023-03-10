


// User function Template for Java

class Solution {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
        // code here
        int start_r = 0, start_c=0;
        int end_r= M-1, end_c=N-1;
        int total = M*N;
        int point = 0;
        
        int[][] ans = new int[M][N];
        
        while(start_r<end_r && start_c<end_c)
        {
            if(start_r+1==M|| start_c+1==N)
            {
                break;
            }
            int prev = Mat[start_r+1][start_c];
            
            for(int i=start_c; i<=end_c ;i++)
            {
                int curr = Mat[start_r][i];
                Mat[start_r][i]=prev;
                prev = curr;
                point++;
            }
            
            start_r++;
            
            for(int i=start_r; i<=end_r; i++)
            {
                int curr = Mat[i][end_c];
                Mat[i][end_c]=prev;
                prev = curr;
                point++;
            }
            
            end_c--;
             for(int i=end_c; i>=start_c; i--)
            {
                int curr = Mat[end_r][i];
                Mat[end_r][i]=prev;
                prev = curr;
                point++;
            }
            
            end_r--;
            
            for(int i= end_r; i>=start_r ; i--)
            {
                int curr = Mat[i][start_c];
                Mat[i][start_c]=prev;
                prev =curr;
                point++;
            }
            
            start_c++;
            
        }
        
        return Mat;
        
    }
}
