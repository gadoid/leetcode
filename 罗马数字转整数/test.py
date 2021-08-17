class Solution:
    def romanToInt(self, s: str) -> int:
        num = 0
        if "IV" in s :
            num +=4 
            s = s.replace("IV","")
        if "IX" in s :
            num +=9
            s = s.replace("IX","")
        if "XL" in s :
            num +=40 
            s = s.replace("XL","")
        if "XC" in s :
            num +=90
            s = s.replace("XC","")
        if "CD" in s :
            num +=400 
            s = s.replace("CD","")
        if "CM" in s :
            num +=900
            s = s.replace("CM","")
        n , h , t = 0 ,0,0
        for i in s :
            if i=="I":
                num += 1
            elif i=="V":
                num += 5
            elif i=="X":
                num += 10
            elif i=="L":
                num += 50
            elif i=="C":
                num += 100
            elif i=="D":
                num += 500
            elif i=="M":
                num += 1000
        return num