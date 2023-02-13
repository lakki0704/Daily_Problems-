//Maximise toys 

//User function Template for Java

class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        
        Arrays.sort(arr);
        
        int total =0, i=0;
        
        while(i<N && K>=arr[i])
        {
            K= K-arr[i];
            total++;
            i++;
        }
        
        return total;
    }
}
