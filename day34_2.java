//Longest common substring without using DP
class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        
        int count =0;
        int final_count =0;
        
        for(int i=0; i<S1.length(); i++)
        {
            int temp = i;
            
            for(int j=0; j<S2.length(); j++)
            {
                int temp2 = j;
                while(temp<S1.length() && temp2<S2.length() && S1.charAt(temp)==S2.charAt(temp2))
                {
                    count ++;
                    temp++;
                    temp2++;
                }
                
                final_count = Math.max(final_count, count);
                count=0;
                temp=i;
            }
        }
        
        return final_count;
    }
}
