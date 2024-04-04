# Create a list
my_list = [1, 2, 3, 4, 5]

# append(x): Add an item to the end of the list.
my_list.append(6)

# extend(iterable): Extend the list by appending all the items from the iterable.
my_list.extend([7, 8, 9])

# insert(i, x): Insert an item at a given position i.
my_list.insert(3, 10)

# remove(x): Remove the first occurrence of a value x.
my_list.remove(5)

# pop([i]): Remove the item at the given position i and return it.
popped_item = my_list.pop(2)

# clear(): Remove all items from the list.
my_list.clear()

# Add some items again for the next demonstrations
my_list.extend([1, 2, 3, 4, 5])

# index(x[, start[, end]]): Return the index of the first occurrence of a value x.
index_of_3 = my_list.index(3)

# count(x): Return the number of times a value x appears in the list.
count_of_4 = my_list.count(4)

# sort(key=None, reverse=False): Sort the items of the list in place.
my_list.sort(reverse=True)

# reverse(): Reverse the elements of the list in place.
my_list.reverse()

# copy(): Return a shallow copy of the list.
copied_list = my_list.copy()

# Print the list and other relevant information
print("List after various operations:", my_list)
print("Popped item:", popped_item)
print("Index of 3:", index_of_3)
print("Count of 4:", count_of_4)
print("Copied list:", copied_list)
