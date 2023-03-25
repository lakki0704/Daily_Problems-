class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++)
        {
           map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
          // map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)+1);
        }
        
        
        int oper=0;
        for(int i=0; i<s2.length();i++)
        {
            char ch=s2.charAt(i);

            if(map1.containsKey(ch) && map1.get(ch)>0){

               map1.put(ch,map1.getOrDefault(ch,0)-1);

            }

            else

            oper++;
        }
        
        if(oper<=k)
        {
            return true;
        }
        return false;
    }
}
