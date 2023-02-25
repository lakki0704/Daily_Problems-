//Parathesis checker


class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<x.length(); i++)
        {
            char c = x.charAt(i);
            if(c=='{' || c =='(' || c=='[')
            {
                st.push(c);
            }
            
            else if(st.isEmpty())
            {
                return false;
            }
            
            else if(c == ')')
            {
                char k = st.pop();
                if(k=='{' || k == '[')
                {
                    return false;
                }
            }
            
            else if(c == '}')
            {
                char k = st.pop();
                if(k=='(' || k == '[')
                {
                    return false;
                }
            }
            
            else if(c == ']')
            {
                char k = st.pop();
                if(k=='{' || k == '(')
                {
                    return false;
                }
            }
        }
        
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
