// Given a list of words followed by two words, the task to find the minimum distance between the given two words in the list of words


// Example 1:

// Input:
// S = { "the", "quick", "brown", "fox", 
//      "quick"}
// word1 = "the"
// word2 = "fox"
// Output: 3
// Explanation: Minimum distance between the 
// words "the" and "fox" is 3

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        
        
        int word1_count =-1;
        int word2_count =-1;
        int dis = Integer.MAX_VALUE;
        
        for(int i=0; i<s.size(); i++)
        {
            if(s.get(i).equals(word1))
            {
                word1_count=i;
            }
            if(s.get(i).equals(word2))
            {
                word2_count=i;
            }
            
            if(word1_count >=0 && word2_count>=0)
            {
                dis = Math.min(Math.abs(word2_count-word1_count),dis);
             }
        }
        
        if(dis==Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return dis;
        }
    }
};
