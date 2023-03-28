class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(1);
        
        for(int i=2; i<=N; i++)
        {
            multiply(i,ans);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
    
    static void multiply(int k, ArrayList<Integer> a)
    {
        int c=0;
        for(int i=0; i<a.size(); i++)
        {
            int p= a.get(i)*k + c;
            a.set(i,p%10);
            c= p/10;
        }
        
        while(c!=0)
        {
            a.add(c%10);
            c=c/10;
            
        }
    }
}
