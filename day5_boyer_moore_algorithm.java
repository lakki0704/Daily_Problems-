class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        int maj = a[0];
        int count =1;
        
        for(int i=1; i<a.length ; i++)
        {
            if(a[i]==maj)
            {
                count++;
            }
            else
            {
                count--;
            }
            
            if(count==0)
            {
                maj = a[i];
                count =1;
            }
        }
        
        int ans =0;
        for(int i=0; i< a.length; i++)
        {
            if(a[i]==maj)
            {
                
                ans++;
            }
        }
        
        if(ans>(a.length)/2)
        {
            return maj;
        }
        else
        {
            return -1;
        }
    }
}
