class Solution {
    //Function to reverse every sub-array group of size k.
   void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        
        int q = n/k;
        int r= n%k;
        ArrayList<Integer> temp = new ArrayList<Integer>(arr);
        
        
        for(int i=0,j=1,b=0; i<q; i++,j++,b++)
        {
            for(int l=k-1, h=0,c=1; l>=0; l--, h++,c++)
            {
                 
                 arr.set(h+(b*k), temp.get((k*j)-c));
            }
        }
        
        for(int i=0; i<r; i++)
            {
                arr.set((q*k)+i, temp.get(n-1-i)) ;
            }
        
    }
}

/*
question:
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K, then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
*/


