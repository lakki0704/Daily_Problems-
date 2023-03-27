class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int low=0,high=n-1;
        
        while(low<=high)
        {
            int mid= (low+high)/2;
            
            if(arr[mid]>x)
            {
                high= mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            
            else
            { 
                Pair ans = new Pair(x,x);
                return ans;
            }
        }
        
        if(high<0)
        {
            Pair ans =  new Pair(-1, arr[0]);
            return ans;
        }
        
        else if(low>=n)
        {
            Pair ans = new Pair(arr[n-1],-1);
            return ans;
        }
        
        else
        {
            Pair ans = new Pair(arr[low-1],arr[high+1]);
            return ans;
        }
    }
}

