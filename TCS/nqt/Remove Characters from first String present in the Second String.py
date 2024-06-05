'''Example 1:
Input: String str1 = “abcdef”
       String str2 = “cefz”
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd.
'''
s=input()
s1=input()
for i in s:
    if i not in s1:
        print(i,end="")