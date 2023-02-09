class Solution {
    char kthCharacter(int m, int n, int k) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        
        int quo = m/2;
        int re = m%2;
        sb.append(String.valueOf(re));
        
        while(quo>0)
        {
            int t= quo;
            quo = quo/2;
            re = t%2 ;
            sb.append(String.valueOf(re));
        }
        sb.reverse();
        
       String s = sb.toString();
        String ans ="";
      
      
      
      
       for(int i=1; i<=n; i++)
       
       {
          ans="";
           
           for(int j = 0; j<s.length(); j++)
           {
               if(s.charAt(j)=='0')
               {
                   ans = ans+ "01";
               }
               else
               {
                   ans= ans + "10";
               }
           }
           
           s = ans;
       }
        
        char c='-';
        
        if(s.length()>=k)
        {
            c = s.charAt(k-1);
        }
        
        return c;
        
    }
}
