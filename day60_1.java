//You are given an array A of size N. Let us denote S as the sum of all integers present in the array. Among all integers present in the array, find the minimum integer X such that S ≤ N*X.



class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
        long S=0;
        for(int i=0; i<N; i++)
        {
            S+=(long)A[i];
        }
        
        
        Arrays.sort(A);
        
        for(int i=0; i<N; i++)
        {
            if(S<=(long)(N)*(long)A[i])
            {
                
                return A[i];
            }
        }
        
        return -1;
    }
}
        
