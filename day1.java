class Solution {
    //Function to reverse every sub-array group of size k.
   void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        
        int q = n/k;
        int r= n%k;
        ArrayList<Integer> temp = new ArrayList<Integer>(arr);
        
        
        for(int i=0,j=1,b=0; i<q; i++,j++,b++)
        {
            for(int l=k-1, h=0,c=1; l>=0; l--, h++,c++)
            {
                 
                 arr.set(h+(b*k), temp.get((k*j)-c));
            }
        }
        
        for(int i=0; i<r; i++)
            {
                arr.set((q*k)+i, temp.get(n-1-i)) ;
            }
        
    }
}


