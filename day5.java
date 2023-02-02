class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        
        int i,j;
        //let 1=up, 2= right 3=down 4=left
        int point;
        int[] ep = new int[2];
        ep[0]=0; ep[1]=0;
        
        if(arr[0][0]==0)
        {
           i=0;
           j=1; 
           point=2;
           
        }
        else
        {
            i=1;
            j=0;
            point=3;
        }
        
        while(!(i<0||j<0||i>=m||j>=n))
        {
           if(arr[i][j]==1)
           {
               
               arr[i][j]=0;
               if(point==1)
               {
                   j++; 
                   point++;
                   continue;
               }
               if(point==2) {
                   i++; 
                   point++;
                   continue;
               }
               if(point==3){
                  j--;
                  point++;
                  continue;
               }  
               if(point==4) 
               { i--; 
                 point=1;
                 continue;
               }
               
           }
           if(arr[i][j]==0)
           {
               
               if(point==1) i--;
               if(point==2) j++;
               if(point==3) i++;
               if(point==4) j--;
           }
           
           
        }
        
        if (i>=m) i=m-1;
        else if (i<=0) i=0;
        if(j>=n) j=n-1;
        else if(j<=0) j=0;
        
        ep[0]=i ; ep[1]=j;
        
        return ep;
    }
}


/*

Given a binary matrix of dimensions N * M. One can perform the given operation into the matrix.

If the value of matrix[i][j] is 0, then traverse in the same direction and check the next value.
If the value of matrix[i][j] is 1, then update matrix[i][j] to 0 and change the current direction from up, right, down, or left to the directions right, down, left, and up respectively.
Initially you start from cell(0, 0), moving in right direction.

The task is to find the indices of the matrix  which leads to outside the matrix from the traversal of the given matrix from the cell (0, 0) by performing the operations.

*/
