// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        
        HashSet<Integer> num = new HashSet<>();
        
        for(int i=0; i<n ; i++)
        {
           
            num.add(a[i]);
        }
        
        int count=0;
        for(int i=0; i<m; i++)
        {
            if(num.contains(b[i]))
            {
                count++;
                num.remove(b[i]);
            }
            
        }
        
        return count;
    }
};
