//Maximum Triplet Product

class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        
        Long ans = Math.max(arr[0]*arr[1]*arr[n-1] , arr[n-1]* arr[n-2]*arr[n-3]);
        
        return ans;
    }
}
