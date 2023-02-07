class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long ans =0, zero=0,pre=0;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0; i<n ; i++)
        {
            pre =pre+arr[i];
            if(pre==0) ans++;
            if(!map.keySet().contains(pre))
            {
                map.put(pre,1);
            }
            else
            {
                map.put(pre , map.get(pre)+1);
            }
        }
        
        for(Map.Entry<Long,Integer> enter : map.entrySet())
        {
            int val = enter.getValue();
            if(val>1)
            {
                ans = ans+ ((val-1)*val/2);
            }
        }
        
        return ans;
        
    }
}


/*

1.Fist find the pre_sum and append the number of times that sum occured in the Hashmap
2.If there are two pre_sum's with same value , that means it will get us a zero sum sub-array 
3. If there are more than two , we get n C 2 , sub-arrays with zero sum 
4. keep adding the count 

*/
