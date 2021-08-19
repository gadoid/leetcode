def test(s):
    dic = {}
    max_len = 0
    a = ""
    if len(s)<=1 :
        return len(s)
    for i in range (0,len(s)):
        if s[i] not in a :
            a += s[i]
            max_len = max_len if max_len > len(a) else len(a)
        else :
            max_len = max_len if max_len > len(a) else len(a)
            a = s[dic[s[i]]:i]
        max_len = max_len if max_len > len(a) else len(a)
        dic[s[i]] = i
    return max_len
    

print(test("abba"))