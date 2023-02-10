// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        int n = s.length();
        String[] num = s.split("[.]");
        boolean ans = true;
        int dot =0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='.')
            {
                dot++;
            }
        }
        
        if(dot!=3)
        {
            return false;
        }
        
        if(num.length!=4)
        {
            return false;
        }
        
        for(int i=0; i<num.length; i++)
        {
            try
            {
                int k = Integer.parseInt(num[i]);
            }
            catch(NumberFormatException e)
            {
                return false;
            }
            
            int k = Integer.parseInt(num[i]);
            if(k<0 || k>255)
            {
                return false;
            }
            
            if(num[i].length()>3)
            {
                return false;
            }
            
            if(num[i].equals("00"))
            {
                return false;
            }
            
            if(num[i].equals("000"))
            {
                return false;
            }
            
            if( num[i].length()>1 && (num[i].charAt(0)=='0'))
            {
                return false;
            }
            
        }
        
        return ans;
    }
}
