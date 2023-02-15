//Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
       ArrayList<Integer> ans = new ArrayList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       int i=1;
       
        int c = k;
        for(int j=0;j<c;j++){

            map.put(A[j],map.getOrDefault(A[j],0)+1);

        }
        ans.add(map.size());
       
       while(i>=1 && i<=n-k)
        {
            map.put(A[i-1],map.get(A[i-1])-1);

            if(map.get(A[i-1])==0){

                map.remove(A[i-1]);

            }

            map.put(A[c],map.getOrDefault(A[c],0)+1);
            c++;
            ans.add(map.size());
            i++;
        }
        
        return ans;
    }
}

