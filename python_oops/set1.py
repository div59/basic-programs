my_dict = {}
t1 = (1, 2, 3)
t2 = (4, 5, 6)
my_dict[t1[0]] = "Value 1"
my_dict[t2] = "Value 2"
print(my_dict)


hashable_set = {(1, 2), (3, 4), (5, 6)}  # Tuples are hashable
# non_hashable_set = {[1, 2], [3, 4], [5, 6]} 
print(hashable_set)


l=[3,4,"5"]
l.append("kj")
l.append(87)
print(l)
t=(88,)
t1=(2,3,4,5)
print(t+t1)