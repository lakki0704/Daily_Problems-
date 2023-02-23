class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        
        int max=0;
        for(int i=0; i<n ; i++)
        {
            int j=n-1;
            while(j>=i)
            {
                if(arr[j]>=arr[i])
                {
                    max= Math.max(max,j-i);
                    break;
                }
                else
                {
                    j--;
                }
            }
            
        }
        return max;
    }
    
    
}
