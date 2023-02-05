/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, N} is missing and one number 'B' occurs twice in array. Find these two numbers.
*/


class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
    // int repeat =-1;
    // int missing =-1;
    int[] ans = new int[2];
    ans[0]=-1; //repeat
    ans[1] =-1; //missing
    
    if(n==2)
    {
        if(arr[0]==arr[1])
        {
            ans[0]= arr[0];
            if(arr[0]>1)
            {
                ans[1] = 1;
            }
            else
            {
                ans[1] = arr[0]+1;
            }
        }
       return ans;
    }
    
    Arrays.sort(arr);
    int count_one=0;
    
    for(int i=0; i<n-1; i++)
    {
        if(arr[i]==1)
        {
            count_one++;
        }
    }
    
    if(count_one==0)
    {
        ans[1]= 1;
    }
    
    for(int i=0; i<n-1;i++)
    {
        if(arr[i]==arr[i+1])
        {
            ans[0]=arr[i];
        }
    }
    
    int i;
    for(i=0; i<n-1; i++)
    {
        if(arr[i+1]-arr[i]>1)
        {
            ans[1]=arr[i]+1;
            break;
        }
    }
    
    if(ans[1]==-1)
    {
        ans[1]=arr[n-1]+1;
    }
    
    
    return ans;
    
    
    }
}
