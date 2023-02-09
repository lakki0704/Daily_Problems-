class Solution
{
   boolean bpm(int bpGraph[][], int u, 
                boolean seen[], int matchR[], int M, int N)
    {
        // Try every job one by one
        for (int v = 0; v < N; v++)
        {
            // If applicant u is interested 
            // in job v and v is not visited
            if (bpGraph[u][v]==1 && !seen[v])
            {
                
                // Mark v as visited
                seen[v] = true; 
                if (matchR[v] < 0 || bpm(bpGraph, matchR[v],
                                         seen, matchR, M, N))
                {
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }
    // Returns maximum number 
    // of matching from M to N
    int maxBPM(int bpGraph[][], int M, int N)
    {
        int matchR[] = new int[N];
        for(int i = 0; i < N; ++i)
            matchR[i] = -1;

        // Count of jobs assigned to applicants
        int result = 0; 
        for (int u = 0; u < M; u++)
        {
            boolean seen[] =new boolean[N] ;
            for(int i = 0; i < N; ++i)
                seen[i] = false;

            // Find if the applicant 'u' can get a job
            if (bpm(bpGraph, u, seen, matchR, M, N))
                result++;
        }
        return result;
    }
    public int maximumMatch(int[][] G)
    {
        // Code here
        int M=G.length;
        int N=G[0].length;
        int ans = maxBPM(G,M,N);
        return ans;
    }
}
