class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
      
    
      if(arr.length==0 || arr==null)
      {
          return "-1";
      }
      String str = arr[0];
      for(int i=1; i<n ; i++)
      {
          String curr = arr[i];
          int j=0;
          while(j<str.length() && j<curr.length() && curr.charAt(j)==str.charAt(j))
          {
              j++;
          }
          if(j==0)
          {
              return "-1";
          }
          str = curr.substring(0,j);
      }
      
      return str;
    }
}

/*
Given a array of N strings, find the longest common prefix among all strings present in the array.


Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.

*/
