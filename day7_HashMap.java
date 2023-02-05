//used HashMap

/*  Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

*/


class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        HashMap <Integer ,Integer> ans = new HashMap<Integer,Integer>();
        int a =0;
        
        for(int i=0; i<n; i++)
        {
            if(ans.containsKey(arr[i]))
            {
                ans.put(arr[i], ans.get(arr[i])+1);
            }
            else
            {
                ans.put(arr[i],1);
            }
        }
        
        
        for(int i=0; i< n; i++)
        {
            if(ans.containsKey(arr[i]) && ans.get(arr[i])==1)
            {
                a =arr[i];
                return a;
            }
        }
        return a;
    }  
    
}
