"""Input string =Prep insta
String after Capitalize the first and last character of each word in a string:- PreP InstA"""
s=input().lower()
s1=s.split()
for i in range(len(s1)):

    k=s1[i]
    s2=k[0].upper()+k[1:-1]+k[-1].upper()
    print(s2,end=" ")


    

