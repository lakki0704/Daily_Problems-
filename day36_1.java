class Solution {
    public static int noConseBits(int n) {
        // code here
        
        String s = Integer.toBinaryString(n);
        
        if(s.length()<3)
        {
            return n;
        }
        
        int count =0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            if(count==3)
            {
                s = s.substring(0,i)+ '0' + s.substring(i+1);
                count=0;
                continue;
            }
            
            else if(s.charAt(i)=='0')
            {
                count=0;
            }
        }
        
        int ans = Integer.parseInt(s,2);
        
        return ans;
    }
}
        
