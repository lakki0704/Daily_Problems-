// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        int n=arr.length;
        int s=0,l=0,x,y,temp,sum;
        
        
        Arrays.sort(arr);
        
        for(int i=0;i<n-3;i++){
            x=arr[i];
            
            for(int j=i+1;j<n-2;j++){
                y=arr[j];
                ArrayList<Integer>eg;
                sum=k-(x+y);
                
                s=j+1;
                l=n-1;
                
                while(s<l){
                    temp=arr[s]+arr[l];
                    if(temp==sum){
                        eg=new ArrayList<>();
                        eg.add(arr[i]);
                        eg.add(arr[j]);
                        eg.add(arr[s]);
                        eg.add(arr[l]);
                        if(!res.contains(eg))
                                res.add(eg);
                        l--;
                        s++;
                    }else if(temp>sum){
                        l--;
                    }else{
                        s++;
                    }
                }
            }
        }
        return res;
        
    }
}


// Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.

// Example 1:

// Input:
// N = 5, K = 3
// A[] = {0,0,2,1,1}
// Output: 0 0 1 2 $
// Explanation: Sum of 0, 0, 1, 2 is equal
// to K.
