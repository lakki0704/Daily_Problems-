class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        
        ArrayList<Integer> lead = new ArrayList<Integer>();
        ArrayList<Integer> num = new ArrayList<Integer>();
      
        lead.add(arr[n-1]);
        num.add(arr[n-1]);
        
        int max = num.get(0);
        
        for(int i=n-2,j=1; i>=0 ; i--,j++)
        {
            
           if(arr[i]>=max)
            {
                lead.add(arr[i]);
            }
            
            num.add(arr[i]);
            if(num.get(j)>max)
            {
                max= num.get(j);
            }
        }
        
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        for(int i=0, j=lead.size()-1; i<lead.size(); i++,j--)
        {
            leaders.add(lead.get(j));
        }
        
        return leaders;
    }
}


/*
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 */
