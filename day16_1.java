//Wall colouring

/*
There is a row of N walls in Geeksland. The king of Geeksland ordered Alexa to color all the walls on the occasion of New Year. Alexa can color each wall with either pink, black, or yellow. The cost associated with coloring each wall with a particular color is represented by a 2D array colors of size N*3 , where colors[i][0], colors[i][1], and colors[i][2] is the cost of painting ith wall with colors pink, black, and yellow respectively.

You need to find the minimum cost to color all the walls such that no two adjacent walls have the same color.

Example 1:

Input:
N = 3
colors[][] = {{14, 2, 11},
             {11, 14, 5},
             {14, 3, 10}}
Output:
10
Explanation:
Color wall 0 with black. Cost = 2. 
Color wall 1 with yellow. Cost = 5. 
Color wall 2 with black. Cost = 3.
Total Cost = 2 + 5 + 3 = 10

*/


class Solution{
	int minCost(int [][] a, int n){
        //Write your code here
        
        
        for(int i=1; i< n; i++){
	        a[i][0]+=Math.min(a[i-1][1], a[i-1][2]);
	        a[i][1]+=Math.min(a[i-1][0], a[i-1][2]);
	        a[i][2]+=Math.min(a[i-1][1], a[i-1][0]);
	    }
	    return Math.min(a[n-1][0], Math.min(a[n-1][1],a[n-1][2]));
    }
}

//Wall colouring
