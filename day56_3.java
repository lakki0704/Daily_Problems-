class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        boolean[] visit = new boolean[leaves+1];
        
        for(int i=0; i<N; i++)
        {
            int stre = frogs[i];
            if(stre<=leaves && visit[stre]==false)
            {
                for(int j= stre; j<=leaves; j+= stre)
                {
                    visit[j]=true;
                }
            }
            
        }
        
        int ans=0;
        for(int i=1; i<=leaves; i++)
        {
            if(!visit[i])ans++;
        }
        
        
        return ans;
    }
}
