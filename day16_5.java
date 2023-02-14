class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> sum = new HashMap<>();
        for(int i=0; i<n ; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int s = arr[i]+arr[j];
                
                if(sum.containsKey(s))
                {
                    sum.put(s,sum.get(s)+1);
                }
                else
                {
                    sum.put(s,1);
                }
            }
        }
        
        int count =0;
        
        for(int i=0; i<n; i++)
        {
            if(sum.containsKey(arr[i]))
            {
                count= count+sum.get(arr[i]);
                
            }
        }
        
        return count;
    }
}
