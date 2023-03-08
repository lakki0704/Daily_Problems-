//Priority Queue

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> p = new PriorityQueue<>();
        for(int i=0; i<n; i++)
        {
            p.add(arr[i]);
        }
        
        long sum = p.poll();
        long final_sum = 0;
        
        while(!p.isEmpty())
        {
            sum = sum + p.poll();
            final_sum += sum;
            p.add(sum);
            sum = p.poll();
        }
        
        return final_sum;
    }
}
