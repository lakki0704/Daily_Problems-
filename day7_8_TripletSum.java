class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       
       boolean ans = false;
       int a1,a2;
       
       Arrays.sort(A);
       ArrayList<Integer> m = new ArrayList<>();
       m.add(A[0]);
       for(int i=1; i<n; i++)
       {
           if(!(m.contains(A[i])))
           {
               m.add(A[i]);
           }
       }
       int k = m.size();
       int[] B = new int[k];
       for(int i=0; i<k ; i++)
       {
           B[i]= m.get(i);
       }
       
       
       
       for(int i=0; i<k; i++)
       {
           a1=B[i];
           for(int j=i+1; j<k; j++)
           {
               a2=B[j];
               int z = Arrays.binarySearch(B, X-(a1+a2));
               if(z>=0 && z!=i && z!=j)
               {
                   ans = true;
                   break;
               }
           }
       }
       
       return ans;
    
    }
}


/*

Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
Example 2:

Input:
n = 5, X = 10
arr[] = [1 2 4 3 6]
Output:
1
Explanation:
The triplet {1, 3, 6} in 
the array sums up to 10.


*/
