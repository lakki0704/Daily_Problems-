class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        int j=0;
        
        for(int i=0; i< a1.length; i++)
        {
            if(a1[i]==a2[j])
            {
                j++;
                if(j==a2.length)
                {
                    break;
                }
            }
        }
        
        if(j==a2.length)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}


/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. 
*/
