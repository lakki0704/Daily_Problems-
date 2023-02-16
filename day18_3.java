
class Solution {
    public static int goodStones(int n, int[] arr) {
        // code here
        
        
        int count =0;
        int[] visit = new int[n];
        
        for(int i=0; i<n; i++)
        {
          
          if(visit[i]==0)
          {
              check(arr, visit, i);
          }
            
        }
        
        for(int i=0; i<n ; i++)
        {
            if(visit[i]==2)
            {
                count++;
            }
        }
        
        return count;
    }
    
    
    public static int check(int[] arr, int[] visit , int index)
    {
        if(index<0 || index>=arr.length)
        {
            return 2; //safe 
        }
        
        if(arr[index]==0)
        {
            return 1;
        }
        
        if(visit[index]!=0)
        {
            return visit[index];
        }
        
        visit[index]=1; //visited
        int new_i = index+ arr[index];
        
        return visit[index]=check(arr, visit, new_i);
    }
}
        
