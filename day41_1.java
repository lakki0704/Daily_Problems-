// You are given an array of N elements and num queries, In each query you are given three numbers L,R and K and you have to tell, 
// how many indexes are there in between L and R(L<=i<=R) such that the frequency of a[i] from index i to n-1 is k.

class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i=0; i<num ; i++)
        {
            int l = Q[i][0];
            int r = Q[i][1];
            int k = Q[i][2];
            int count =0;
            
            for(int j=l; j<=r; j++)
            {
                if(check(A,j,A[j]) == k)
                {
                    count++;
                }
            }
            
            a.add(count);
            
        }
        
        return a;
        
    }
    
    static int check(int[] arr, int strt, int ele)
    {
        int freq=0;
        for(int i=strt; i<arr.length; i++)
        {
            if(arr[i]==ele)
            {
                freq++;
            }
        }
        
        return freq;
    }
}
        
