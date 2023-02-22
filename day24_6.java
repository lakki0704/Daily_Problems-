class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        long[] ans = new long[n];
        Stack<Long> st = new Stack<>();
        
        
        for(int i=n-1; i>=0; i--)
        {
            if(!st.isEmpty() && st.peek()>arr[i])
            {
                ans[i] = st.peek();
            }
            
            else if(!st.isEmpty() && st.peek()<=arr[i])
            {
                while(!st.isEmpty() && st.peek()<=arr[i])
                {
                    st.pop();
                }
                
                if(st.isEmpty())
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i] = st.peek();
                }
            }
            
            st.push(arr[i]);
        }
        
        ans[n-1] = -1;
        return ans;
    } 
}
