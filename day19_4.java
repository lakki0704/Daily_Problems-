/*
Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

Example 1:

Input:
Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4]
[6,8],[9,10], we have only two overlapping
intervals here,[1,3] and [2,4]. Therefore
we will merge these two and return [1,4],
[6,8], [9,10].
*/



class Solution
{
    public int[][] overlappedInterval(int[][] arr)
    {
        // Code here // Code here
        //i+++++ and j=0,1
        Arrays.sort(arr, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] i, int[] j)
            {
                if(i[0]>j[0])
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        }
        );
        
        
      
      ArrayList<int[]> a = new ArrayList<>();
        
        int start = arr[0][0];
        int end = arr[0][1];
        
        if(arr.length ==1)
        {
            
           int[][] ans = {{start,end}};
           return ans;
        }
        
        int prev[] = arr[0];
        
        for(int i=1; i<arr.length ; i++)
        {
            int[] curr = arr[i];
            if(curr[0]<=prev[1])
            {
                prev[1] = Math.max(curr[1],prev[1]);
            }
            
            else
            {
                a.add(prev);
                prev = curr;
            }
        }
        
        a.add(prev);
        int[][] ans = new int[a.size()][2];
        for(int i=0; i<a.size(); i++)
        {
            ans[i] = a.get(i);
        }
        
        return ans;
        
        
        
        
    }
}
