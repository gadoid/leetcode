a = 123 
a = str(a)
b = []
for i in range (0,len(a)):
    b.append(a[i])
c = "".join(b[::-1])
print(c)