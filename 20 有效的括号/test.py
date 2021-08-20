


def test(s):
    if len(s)%2 != 0 or len(s)==0 :
        return False
    c = {"(":")","[":"]","{":"}"}
    return isValid(s,c)



def isValid(a,c):
    print(a)
    if len(a)==0 or len(a)==2:
        return True
    else :
        i = len(a)-1
        while a[i] != c[a[0]] :
            if i == 0:
                return False
            i-=1
        else :
            if i == len(a)-1:
                return isValid(a[1:i],c)
            else :
                return isValid(a[1:i],c),isValid(a[i+1:],c)


s="{()()[)]}"
print(isValid(s))


