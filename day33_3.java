//return two prime

//User function Template for Java

class Solution{
    static List<Integer> primeDivision(int N){
        // code here
        
        List<Integer> a = new ArrayList<>();
        
        for(int i=2; i<=N/2; i++)
        {
            if(prime(i) && prime(N-i))
            {
                a.add(i);
                a.add(N-i);
                break;
            }
        }
        
        return a;
    }
    
    static boolean prime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
