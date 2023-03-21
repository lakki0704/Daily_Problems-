//Stock SPan Problem

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] ans = new int[n];
        Stack<Integer> st=new Stack<Integer>();

        for(int i=0;i<n;i++){

            while(st.isEmpty()==false && price[st.peek()] <= price[i]){

                st.pop();

            }

            ans[i]=(st.isEmpty())? i+1 : (i - st.peek());

            st.push(i);

        }


        
        return ans;
    }
    
}
