class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(n==0 || n==1)
        {
            ans.add(-1);
            return ans;
        }
        
       int[] a = new int[n];
       for(int i=0; i< n; i++)
       {
           a[arr[i]]++;
       }
        
       for(int i=0; i<n; i++)
       {
           if(a[i]>=2)
           {
               ans.add(i);
           }
       }
        
        if(ans.isEmpty())
        {
            ans.add(-1);
            return ans;
        }
        
        
        return ans;
    }
}

/*

Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Note: The extra space is only for the array to be returned.
Try and perform all operations within the provided array. 

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.

*/
