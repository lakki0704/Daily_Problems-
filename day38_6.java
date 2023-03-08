



class Solution {
    String printLargest(String[] arr) {
        // code here
        
        //Compare method returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. 
        
        Arrays.sort(arr, new Comparator<String>()
        {
            @Override
            public int compare(String x, String y)
            {
                String xy = x+y;
                String yx = y+x;
                return yx.compareTo(xy);
            }
        });
        
        String ans="";
        
        for(String s : arr)
        {
            ans += s;
        }
        
        return ans;
        
    }
}
