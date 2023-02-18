
/*
Given a non-empty array of integers, find the top k elements which have the highest frequency in the array. If two numbers have the same frequency then the larger number should be given preference. 

Note: Print the elements according to the frequency count (from highest to lowest) and if the frequency is equal then larger number will be given preference.

Example 1:

Input:
N = 6
nums = {1,1,1,2,2,3}
k = 2
Output: {1, 2}

*/






class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        for(int i=0, j= nums.length-1; i<nums.length; i++, j--)
        {
            arr[i] = nums[j];
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
         ArrayList< Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
       
        list.sort((a,b) -> Objects.equals(a.getValue(), b.getValue())? b.getKey()-a.getKey():b.getValue()-a.getValue());
        
        int[] ans = new int[k];
        
        for(int i=0; i<k;i++)
        {
            ans[i] = list.get(i).getKey();
        }
        
        return ans;
        
        
    }
}
