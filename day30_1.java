//Optimal Array


class Solution {
    public long[] optimalArray(int n,int a[])
    {
        //ArrayList<Integer> ar = new ArrayList<>();
        
        long[] ans = new long[n];
        ans[0] = 0;
        long count =0;
        
        for(int i=1; i<n ; i++)
        {
            int med = a[i/2];
            count = count + (long)a[i]-med;
            ans[i] = count;
        }
        
        return ans;
    }
}
        
