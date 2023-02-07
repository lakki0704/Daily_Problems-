//Given two strings A and B. Find minimum number of times A has to be repeated such that B is a Substring of it. If B can never be a substring then return -1.


class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int ans =-1;
        int a_len = A.length();
        int b_len = B.length();
        int i=1;
        int min = a_len;
        while(min<b_len)
        {
            i++;
            min = a_len*i;
        }
        
        String str = "";
        for(int j=0; j<i; j++)
        {
            str = str+A;
        }
        
        if(str.contains(B))
        {
            return i;
        }
        str = str+A;
        if(str.contains(B))
        {
            return i+1;
        }
        
        return ans;
        
        
        
    }
};

//question asked in google 
