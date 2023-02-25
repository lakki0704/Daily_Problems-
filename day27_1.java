//Valid Compressed String 
class Solution {
    static int checkCompressed(String S, String T) {
        // code here
         int m = T.length();

        int n = S.length();

        int i = 0;

        int j=0;

        

        while(i<m && j<n)

        {

            if(Character.isDigit(T.charAt(i))){

                String s = "";

                while(i<m && Character.isDigit(T.charAt(i))){

                    s+=T.charAt(i++);

                }

                j+=Integer.parseInt(s);

            }else if(T.charAt(i)!=S.charAt(j)){

                return 0;

            }else{

                i++;

                j++;

            }

            

        }

        if(i==T.length() && j==S.length()) return 1;

        return 0;
    }
}
