/*
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, 
the consecutive numbers can be in any order.

Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.

*/



class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Arrays.sort(arr);
	   int count = 0, count_max=0;
	   
	   for(int i=0; i<N-1 ; i++)
	   {
	       if(arr[i+1]-arr[i]==1)
	       {
	           count++;
	       }
	       else if(arr[i+1]-arr[i]==0)
	       {
	           count_max = Math.max(count,count_max);
	           continue;
	       }
	       else
	       {
	           count=0;
	           
	       }
	       
	       count_max = Math.max(count,count_max);
	   }
	   
	   return count_max+1;
	}
}
