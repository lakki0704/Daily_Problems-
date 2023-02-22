/*
Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place.

*/

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<N; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        for(int i=1, j=0; j<N ; i++,j++)
        {
            if(map.containsKey(i) && i<=P)
            {
                arr[j] = map.get(i);
            }
            else
            {
                arr[j] =0;
            }
        }
    }
}
