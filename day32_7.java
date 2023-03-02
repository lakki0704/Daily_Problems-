/ User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i=M ; i<=N; i++)
        {
            if(i==1)
            {
                continue;
            }
            
            if(checkprime(i))
            {
                a.add(i);
            }
        }
        
        return a;
        
        
    }
    
    static boolean checkprime(int n)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        
        return true;
    }
}
