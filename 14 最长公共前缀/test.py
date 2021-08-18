class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
            if len(strs) == 1 :
                return strs[0] 
            n = 0
            while True : 
                for i in range (1,len(strs)) :
                    if n >= len(strs[i]) or n >= len(strs[0]):
                        return strs[0][:n]
                    if strs[0][n] == strs[i][n]:
                        pass 
                    else :
                        if n == 0 :
                            return ""
                        else :
                            return strs[0][:n]
                n+=1 