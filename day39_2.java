//Roman to Integer

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int ans = map.get(str.charAt(str.length()-1));
        
        for(int i=str.length()-2; i>=0; i--)
        {
            char c = str.charAt(i);
            char ch = str.charAt(i+1);
            int curr = map.get(c);
            int prev = map.get(ch);
            
            if(prev>curr)
            {
                ans = ans - curr;
            }
            else if(prev==curr || prev<curr)
            {
                ans = ans + curr;
            }
        }
        
       return ans;
    }
}
