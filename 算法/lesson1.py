def less(N):
    if N==0:
        return 0
    if N==1 or N==2 :
        return 1 
    c =dict()
    c[1]=c[2]=1
    c[0] = 0
    for i in range (3,N+1):
        c[i] = c[i-1]+c[i-2]
    print(c)
    return c[N]
a'a'a
print(less(45))
