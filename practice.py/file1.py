with open("sample1.txt","w") as f:
    f.write("hi i am ")
with open("sample1.txt") as f:
    print(f.read())