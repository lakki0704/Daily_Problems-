class Sol
{
    int getCount (String S, int N)
    {
        // your code here
        HashMap<Character,Integer> map = new HashMap<>();
        int n = S.length();
        map.put(S.charAt(0), 1);
        for(int i=1; i<n; i++)
        {
            if(S.charAt(i)==S.charAt(i-1))
            {
               // map.put(S.charAt(i), map.get(S.charAt(i))-1);
                continue;
            }
            if(!(map.containsKey(S.charAt(i))))
            {
                map.put(S.charAt(i),1);
            }
            else
            {
                map.put(S.charAt(i), map.get(S.charAt(i))+1);
            }
        }
        
        int count =0;
        
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==N)
            {
                count++;
            }
        }
        
        return count;
    }
}
