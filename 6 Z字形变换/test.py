class Solution:
    def convert(self, s: str, numRows: int) -> str:
        Dlist = []
        if numRows == 1:
            return s
        for i in range (0,numRows):
            Dlist.append([])
        j,p,z = 0,0,0
        for i in s :
            if p%(numRows-1) == 0 :
                Dlist[j].append(i) 
                j+=1       
            else :
                while j!=numRows :
                    if p%(numRows-1) + j == numRows-1 :
                        Dlist[j].append(i)
                        j+=1
                    else :
                        Dlist[j].append(" ")
                        j+=1
            if j == numRows :
                j =0   
                p+=1    
        s = ""
        for o in Dlist:
            s +="".join(o)
        return s.replace(" ","")
    

a =Solution()
s = "ABCD"
num = 1
print(a.convert(s,num))