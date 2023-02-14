// Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.

// Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then
// (u1,v1) should be printed first else second.





//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        Arrays.sort(B);
        
        ArrayList<pair> ans = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        int m = B.length;
        int n = A.length;
        
        for(int i=0; i<m; i++)
        {
            b.add(B[i]);
        }
        
        for(int i=0; i<n ; i++)
        {
            if(b.contains(X-A[i]))
            {
                pair p = new pair(A[i], X-A[i]);
                ans.add(p);
            }
        }
        pair[] all = ans.toArray(new pair[ans.size()]);
        
        return all;
    }
}
