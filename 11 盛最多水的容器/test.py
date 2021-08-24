def test(s):
    l = 0
    m = len(s)-1
    length = len(s)-1
    area = 0
    while l < m :
        area = max(area,length*min(s[l],s[m]))
        if s[l]<s[m] :
            l +=1
        else  :
            m -=1 
        length -=1
    return area

print(test([1,2,1]))