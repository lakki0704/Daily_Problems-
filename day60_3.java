class Solution {
    String removeDuplicates(String str) {
        // code here
        ArrayList<Character> h = new ArrayList<>();
        for(int i=0; i<str.length(); i++)
        {
            if(!h.contains(str.charAt(i))){
            h.add(str.charAt(i));
            }
        }
        
        String ans="";
        for(int i=0; i<h.size(); i++)
        {
            ans += Character.toString(h.get(i));
        }
        
        return ans;
    }
}

