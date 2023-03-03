//cutting rectangles

class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        // long k = Math.max(L,B);
        long gcd = g(L,B);
        
        long N =0;
        long K = gcd;
        
        if(K!=0)
        {
            N = (L*B)/(K*K);
        }
        
        List<Long> a = new ArrayList<>();
        a.add(N);
        a.add(K);
        return a;
        
        
    }
    
     public static long g(long a, long b) {

     if (b == 0) {

         return a;

     }

     return g(b, a % b);

 }
}
