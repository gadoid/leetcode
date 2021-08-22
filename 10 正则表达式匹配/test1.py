class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        n,m = 0,0
        while m < len(s) and n<len(p) :
            if p[n] == s[m]:
                n+=1
                m+=1
            elif p[n] == "*":
                if s[m] == p[n-1]:
                    m+=1
                else :
                    n+=1
            elif p[n] != s[m] and p[n+1] == "*":
                n+=2
                m+=1
            elif p[n] == ".":
                if s[m-1] == p[n]:
                    m+=1
                else :
                    n+=1
            else :
                return False
            if m == len(s)-1 and n == len(p)-1:
                return True
            elif m == len(s-1) and n != len(p-1) :
                return False
        else :
            return False


s = "aa"
p = "a*"
print(Solution().isMatch(s,p))