import math

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if len(s)<numRows : 
            return s 
        length = 3*numRows - 2 
        a = math.ceil(len(s)/length)
        c = a
        list1 = list(s)
        list2 =list()
        x = 0
        m = 2
        while len(list2) != len(list1):
                if x%length == 0 or (x+1)%length == numRows:
                    list2.append(list1[x])
                    list2.append(list1[x+2*numRows-2])
                    x+=1
                else :
                    while x < numRows-1 :
                        list2.append(list1[x])
                        list2.append(list1[x+2*numRows-2*m])
                        list2.append(list1[x+2*numRows-2])
                        m+=1
                        x+=1
                    else :
                        m = 2 
                if c>1:
                    x=x+ length-1
                    c-=1
                else :
                    c=a

        strs = "".join(list2)
        print(strs)


s = "PAYPALISHIRING"
print(Solution().convert(s,4))