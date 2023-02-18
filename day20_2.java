//Print pattern - asked in Microsoft

//Print a sequence of numbers starting with N where A[0] = N, without using loop, in which  A[i+1] = A[i] - 5,  until A[i] > 0. After that A[i+1] = A[i] + 5  repeat it until A[i] = N.

class Solution{
    static List<Integer> pattern(int N){
        // code here
        
        List<Integer> ans = new ArrayList<>();
        
        int i=0;
        ans.add(N);
        
        while(ans.get(i)>0)
        {
            ans.add(ans.get(i)-5);
            i++;
        }
        
        
        
        while(ans.get(i)<N)
        {
            ans.add(ans.get(i)+5);
            i++;
        }
        
        return ans;
    }
}



