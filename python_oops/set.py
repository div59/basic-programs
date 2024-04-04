# Create sets
set1 = {1, 2, 3}
set2 = {3, 4, 5}

# add(elem): Add an element to the set.
set1.add(4)

# remove(elem): Remove an element from the set. Raises KeyError if the element is not present.
set1.remove(3)

# discard(elem): Remove an element from the set if it is present.
set2.discard(5)

# pop(): Remove and return an arbitrary element from the set. Raises KeyError if the set is empty.
popped_element = set1.pop()

# clear(): Remove all elements from the set.
set2.clear()

# copy(): Return a shallow copy of the set.
copied_set = set1.copy()

# union(*others): Return a new set with elements from the set and all others.
union_set = set1.union(set2)

# intersection(*others): Return a new set with elements common to the set and all others.
intersection_set = set1.intersection(set2)

# difference(*others): Return a new set with elements in the set that are not in any of the others.
difference_set = set1.difference(set2)

# symmetric_difference(other): Return a new set with elements in either the set or other but not both.
symmetric_difference_set = set1.symmetric_difference(set2)

# issubset(other): Report whether another set contains this set.
subset_check = set1.issubset(set2)

# issuperset(other): Report whether this set contains another set.
superset_check = set1.issuperset(set2)

# Print the sets and other relevant information
print("Set 1:", set1)
print("Set 2:", set2)
print("Popped element from Set 1:", popped_element)
print("Copied set from Set 1:", copied_set)
print("Union of Set 1 and Set 2:", union_set)
print("Intersection of Set 1 and Set 2:", intersection_set)
print("Difference of Set 1 and Set 2:", difference_set)
print("Symmetric difference of Set 1 and Set 2:", symmetric_difference_set)
print("Is Set 1 a subset of Set 2?", subset_check)
print("Is Set 1 a superset of Set 2?", superset_check)
