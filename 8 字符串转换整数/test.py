class Solution:
    def myAtoi(self, s: str) -> int:
        list1 =  ["1","2","3","4","5","6","7","8","9","0"]
        s = s.lstrip(" ")
        if len(s) == 0 or (len(s)==1 and s not in list1):
            return 0
        p=1
        n = 0
        if s[0] == "-":
            p = -1 
            n+=1
        elif s[0] == "+":
            pass
            n+=1
        elif s[0] in list1:
            pass
        else :
            return 0
        for i in range (n,len(s)):
            if i == n and s[i] not in list1:
                return 0
            elif s[i] not in list1 :
                    num = p*int(s[n:i])
                    break
            elif s[i] in list1 and i == len(s)-1:
                num = p*int(s[n:])
                break

        num = 2**31-1 if num > 2**31-1 else num 
        num = -2**31 if num < -2**31 else num 
        return num