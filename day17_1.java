//chocolate distribution problem


class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        
       // int diff = 0;
        Collections.sort(a);
        int min=Integer.MAX_VALUE;

        for(int i=0;i<=n-m;i++)

        {

            int b= a.get(i+m-1)-a.get(i);

            if(min>b)

            min=b;

        }

        return min;
    }
}
