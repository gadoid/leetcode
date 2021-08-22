class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        s = list(s)
        i = 0
        j = 0
        while i < len(p):
            if   s[j] == p[i] :
                j+=1
                i+=1
            elif p[i] == ".":
                j+=1
                i+=1
            elif p[i] == "*":
                if p[j-1]=="." or s[j] == p[i-1]  :
                    j+=1
                else :
                    i+=1
            elif s[j] != p[i] :
                if i != len(p) and p[i+1] == "*                                                                                                                             ":
                    i+=1
                 
            