class Solution{
    static String longestPalin(String S){
        // code here
        
        int maxlen= 1;
        String ans ="";
        if(S.length()<2)
        {
            return S;
        }
        
        for(int i=0; i<S.length(); i++)
        {
            int low = i-1;
            int high = i+1;
            
            while(low>=0 && S.charAt(low)==S.charAt(i))
            {
                low--;
            }
            
            while(high<S.length() && S.charAt(high)==S.charAt(i))
            {
                high++;
            }
            
            while(low>=0 && high<S.length() && S.charAt(high)==S.charAt(low))
            {
                low--;
                high++;
            }
            
            if((high-low+1)>maxlen)
            {
                maxlen= high-low+1;
                ans = S.substring(low+1,high);
            }
        }
        
        return ans;
        
    }
}
