class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int[] ans = new int[k];
        
        for(int i=n-1,j=0; (i>=0 && j<k); i--,j++)
        {
            ans[j] = arr[i] ;
        }
        
        return ans;
    }
}
