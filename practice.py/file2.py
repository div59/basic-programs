with open("div.txt","w") as f:
    f.write("I am divya")
with open("div.txt","a") as f:
    f.write(" I am good girl")
with open("div.txt") as f:
    print(f.read())