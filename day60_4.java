class Solution {
    static int minRepeats(String A, String B) {
        // code here
        for(int i=0; i<B.length(); i++)
        {
            char c = B.charAt(i);
            String ch = Character.toString(c);
            if(A.contains(ch)==false)
            {
                return -1;
            }
        }
        
        int count =1;
        int blen = B.length();
        int alen = A.length();
        int a = alen;
        String s = A;
        
        while(alen<=blen)
        {
            if(A.contains(B)==false)
            {
                count++;
                A+= s ;
                alen+= a;
            }
            if(A.contains(B)==true)
            {
                return count;
            }
        }
        
        if(A.contains(B))
        {
            return count;
        }
        
        else
        {
            return -1;
        }
        
    }
};
