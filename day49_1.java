

class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        int[] right1 = new int[N];
        int[] left1 = new int[N];
        
        left1[0]=0;
        left.add(A[0]);
        for(int i=1; i<N; i++)
        {
            left1[i]= left.size();
            if(!left.contains(A[i]))
            {
                left.add(A[i]);
            }
        }
        
        right1[N-1]=0;
        right.add(A[N-1]);
        
        for(int i= N-2; i>=0; i--)
        {
            right1[i]= right.size();
            if(!right.contains(A[i]))
            {
                right.add(A[i]);
            }
        }
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            int a = (left1[i]-right1[i]);
            ans.add(a);
        }
        
        return ans;
    }
}
        
