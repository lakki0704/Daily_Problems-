//N meetings in a room

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    static class Pair implements Comparator<Pair>
    {
        int start;
        int end;
        Pair()
        {}
        
        Pair(int start, int end)
        {
            this.start = start;
            this.end= end;
        }
        
        public int compare(Pair p1, Pair p2)
        {
            return p1.end-p2.end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            Pair p = new Pair(start[i], end[i]);
            list.add(p);
        }
        
        
        Collections.sort(list, new Pair());
        
        int count=1;
        int last = list.get(0).end;
        
        for(int i=1; i<n; i++)
        {
            int st = list.get(i).start;
            int en= list.get(i).end;
            
            if(st>last)
            {
                count++;
                last = en;
            }
        }
        
       return count;
    }
}
