class Solution:
    #Your task is to complete this function
    #Function should return an integer
    #a - list/array containing height of stack's respectively
    def max_Books(self, n, k, a):
        #code here
        
        count =0
        books =0
            
        for i in range(0,len(a)):
            if(a[i]<=k):
                books = books+a[i]
            elif(a[i]>k):
                books =0
            
            count = max(count,books)
        return count
