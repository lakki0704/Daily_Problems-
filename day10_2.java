//

/*
Given a Matrix size N*N and an integer K. Initially, the matrix contains only 0. You are given K tasks and for each task, you are given two coordinates (r,c) [1 based index]. Where coordinates (r,c) denotes rth row and cth column of the given matrix.

You have to perform each task sequentially in the given order. For each task, You have to put 1 in all rth row cells and all cth columns cells.

After each task, You have to calculate the number of 0 present in the matrix and return it.

Example 1:

Input:
n = 3, k= 3
2 2
2 3
3 2
Output: 4 2 1
Explanation: 
After 1st Operation, all the 2nd row
and all the 2nd column will be filled by
1. So remaning cell with value 0 will be 4
After 2nd Operation, all the 2nd row and all
the 3rd column will be filled by 1. So 
remaning cell with value 0 will be 2.
After 3rd Operation cells having value 0 will
be 1.
*/


class Solution {
    long[] countZero(int N, int K, int[][] arr){
        // code here
        
        long[] ans = new long[K];
        
        int t = N*N;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
       
       for(int i=0; i<K ; i++)
       {
           row.add(arr[i][0]-1);
           col.add(arr[i][1]-1);
           ans[i]=(t)-((row.size()*N) + (col.size()*(N-row.size())));
       }
       
       return ans;
        
    }
}
