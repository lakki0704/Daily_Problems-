/*
Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

*/

class Solution
{
    public boolean findPair(int arr[], int n, int l)
    {
        //code here.
        //n -size l=number
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            list.add(arr[i]);
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
                
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
      
        
        for(int i=0; i<n; i++)
        {
            if(l!=0 && list.contains(l+arr[i]))
            {
                return true;
            }
            else if(l==0 && map.get(arr[i])>1)
            {
                return true;
            }
        }
        
        return false;
    }
}
