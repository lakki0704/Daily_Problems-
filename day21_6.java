//common elements in two arrays

class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        Arrays.sort(v1);
        Arrays.sort(v2);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        
        for(int i=0; i<v1.length; i++)
        {
            map1.put(v1[i],map1.getOrDefault(v1[i],0)+1);
        }
        
        for(int i=0; i<v2.length; i++)
        {
            map2.put(v2[i],map2.getOrDefault(v2[i],0)+1);
        }
        
        for(int i=0; i<v1.length; i++)
        {
            if(map2.containsKey(v1[i]))
            {
                ans.add(v1[i]);
                map2.put(v1[i],map2.get(v1[i])-1);
                if(map2.get(v1[i])==0)
                {
                    map2.remove(v1[i]);
                }
            }
        }
        
        return ans;
    }
}
