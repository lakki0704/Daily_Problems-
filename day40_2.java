
// Minimize number of Students to be removed


// N Students of different heights are attending an assembly. The heights of the students are represented by an array H[]. The problem is that if a student has less or equal height than the student standing in front of him, then he/she cannot see the assembly. Find the minimum number of students to be removed such that all the remaining students can see the assembly.


//User function Template for Java

class Solution {
    public int removeStudents(int[] H, int N) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        a.add(H[0]);
        for(int i=1; i<N; i++)
        {
            if(H[i]>a.get(a.size()-1))
            {
                a.add(H[i]);
            }
            
            else
            {
                for(int j=0; j<a.size(); j++)
                {
                    if(H[i]<=a.get(j))
                    {
                        a.set(j,H[i]);
                        break;
                    }
                }
            }
        }
        
        int count = N - a.size();
        
        return count;
    }
};
