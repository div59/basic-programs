with open("mitsogo.txt","w") as f:
    f.write("i am divya m kumbar from git")
# with open("mitsogo.txt") as f:
#     print(f.read())
with open("mitsogo.txt","a") as f:
    f.write("  i m ready to give interview")
# with open("mitsogo.txt") as f:
#     print(f.read())
with open("mitsogo.txt") as f:
    f.seek(0)
    print(f.readline().strip())
# with open("mitsogo.txt") as f:
#     print(f.readlines())