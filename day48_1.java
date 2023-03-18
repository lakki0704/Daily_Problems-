


//User function Template for Java

class Solution {
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        
        arr.sort((a,b) -> a.get(0) - b.get(0));
        int max = 0;
        int i =0;
        while(i<arr.size()){
            int j = i+1;
            while(j<arr.size() && arr.get(i).get(0)==arr.get(j).get(0)){
                int gcd = GCD(arr.get(i).get(1),arr.get(j).get(1));
                if(gcd>max) max = gcd;
                j++;
            }
            if(j==arr.size())break;
            else 
            i=j;
        }
        return max;
        
        
    }
    
    static int GCD(int a , int b)
    {
        int k = Math.min(a, b);
        while(k>0)
        {
            if(a%k==0 && b%k==0)
            {
                break;
            }
            k--;
        }
        
        return k;
    }
};
