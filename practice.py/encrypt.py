'''Input: S = “aaaaaaaaaaa”
Output: ba  
Explanation:
    First convert the given string to “a11” i.e. write, character along with its frequency.
Then, change “a11” to “ab” because 11 is b in hexadecimal.
Then, finally reverse the string i.e “ba”.'''

s=input()
l=[]
for i in s:
    c=s.count(i)
    if i not in l:
        l.append(i)
        h=hex(c)[2:]
        l.append(h)
l.reverse()
print("".join(map(str,l)))
