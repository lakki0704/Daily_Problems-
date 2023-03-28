

//question:

/*
Geek went to buy some chocolates from a nearby shop with k coins in his pocket. He found that the shop contains n chocolates which are arranged in sorted order (increasing) of their prices.

Now geek wants to taste costlier chocolates so he decided that he will buy the costliest chocolate (of course among the ones that he can afford) till there exists at least one type of chocolate he can afford. You may assume that there is an infinite supply of chocolates in the shop Geek visited.

As you know, Geek is a shy person and hence he will enquire about the prices of the chocolates at most 50 times from the shopkeeper. Now, your task is to find the number of chocolates he had enjoyed. 

Note: If you call the Shop.get function more than 50 times it will return -1. Price of chocolates are pairwise distinct.

*/
class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    static long find(int n, long k){
        // Return the number of chocolates Geek had
        // enjoyed out of 'n' chocolates availabe in the
        // 'shop'.
        long ans=0;
        int low =0;
        int high=n-1;
        
        int call=0;
        while(call<=50 && k>0)
        {
            long curr=-1;
            
            while(low<=high)
            {
                int mid= (low+high)/2;
                long cost = shop.get(mid);
                
                if(cost>k)
                {
                    high=mid-1;
                }
                else
                {
                    curr = cost;
                    low = mid+1;
                }
                
            }
            
            if(curr==-1)break;
            ans+= k/curr;
            k=k%curr;
            low =0;
            call++;
        }
        
        return ans;
    }

}
