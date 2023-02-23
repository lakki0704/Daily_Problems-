//alternate positive and neg numbers.
//0 comes in +ve nums 
//start the array with positive nums


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        
        int i=0,j=0,k=0;
        while(i<pos.size() && j<neg.size())
        {
            if(k%2==0)
            {
                arr[k] = pos.get(i);
                i++;
            }
            else
            {
                arr[k] = neg.get(j);
                j++;
            }
            
            k++;
        }
        
        while(k<n && i<pos.size())
        {
            arr[k++] = pos.get(i);
            i++;
        }
        
        
        while(k<n && j<neg.size())
        {
            arr[k++] = neg.get(j);
            j++;
        }
        
    }
}
