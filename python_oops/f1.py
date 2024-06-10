with open("abc.txt","w") as f:
    f.write("divyni is good girl")
with open("abc.txt","a") as f:
    f.write(" and u r also a cute girl")
with open("abc.txt") as f:
    print(f.read())
