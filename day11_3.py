class Solution:
    def ExtractNumber(self,S):
        
        large =-1;
        S= list(S.split(" "))
        for i in range(len(S)):
            if(S[i].isdigit() and ('9' not in S[i]) and (large<int(S[i]))):
                large = int(S[i])
                
        return large
        
        
  #Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9. 
