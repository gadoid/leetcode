def hw(x):
    x= x if x >0  else -x 
    x=str(x)
    print(x)
    for i in range (0,len(x)//2):
        if x[i] != x[-(1+i)]:
            return False
    return True


print(hw(-12321))