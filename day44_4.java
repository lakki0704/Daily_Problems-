//Reverse First K elements of a Queue

// User function Template for Java

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        
        ArrayList<Integer> firstk = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        
        Queue<Integer> ans = new LinkedList<>();
        
        for(int i=0; i<k; i++)
        {
            firstk.add(q.remove());
        }
        
        while(!q.isEmpty())
        {
            last.add(q.remove());
        }
        
        for(int i=k-1; i>=0; i--)
        {
            ans.add(firstk.get(i));
        }
        
        for(int i=0; i<last.size(); i++)
        {
            ans.add(last.get(i));
        }
        
        return ans;
    }
}
