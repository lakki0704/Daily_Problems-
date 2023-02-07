

//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i< S.length(); i++)
        {
            
            //ans.add(Character.toString(S.charAt(i)));
            String str="";
            for(int j=i; j<S.length(); j++)
            {
                str= str+ Character.toString(S.charAt(j));
                ans.add(str);
            }
        }
        
        int len = -1;
        String res ="";
        for(int i=0; i<ans.size(); i++)
        {
            StringBuilder in = new StringBuilder();
            in.append(ans.get(i));
            in.reverse();
            if(ans.get(i).length() > len && (in.toString().equals(ans.get(i))))
            {
                len = ans.get(i).length();
                res= ans.get(i);
                
            }
        }
        
        return res;
        
    }
}


/*
Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index).

*/
