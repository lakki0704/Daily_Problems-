class Solution 
{ 
    String removeReverse(String S) 
    { 
        // code here
        int[] freq = new int[26];
        StringBuilder s = new StringBuilder(S);
        
        for(int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            freq[ch-'a']++;
        }
        
        int start =0, end= S.length()-1,flag=0;
        
        while(start<=end)
        {
            if(flag==0)
            {
                if(freq[s.charAt(start)-'a']==1)
                {
                    start++;
                }
                else
                {
                    freq[s.charAt(start)-'a']--;
                    
                    
                    s.replace(start,start+1,"#");
                    start++;
                    flag=1;
                }
            }
            else
            {
                if(freq[s.charAt(end)-'a']==1)
                {
                    end--;
                }
                else
                {
                    freq[s.charAt(end)-'a']--;
                    
                    s.replace(end,end+1,"#");
                    end--;
                    flag=0;
                }
            }
            
            
            
        }
        
        if(flag==1)
        {
                s.reverse();
        }
        
        String ans = "";
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                ans+= s.charAt(i);
            }
        }
        
        return ans;
    }
}
