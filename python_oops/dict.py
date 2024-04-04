# Create a dictionary
my_dict = {'a': 1, 'b': 2, 'c': 3}

# clear(): Remove all items from the dictionary.
my_dict.clear()

# Populate the dictionary again for further demonstration
my_dict = {'a': 1, 'b': 2, 'c': 3}

# copy(): Return a shallow copy of the dictionary.
copied_dict = my_dict.copy()

# items(): Return a new view of the dictionary's items (key-value pairs).
dict_items = my_dict.items()

# keys(): Return a new view of the dictionary's keys.
dict_keys = my_dict.keys()

# values(): Return a new view of the dictionary's values.
dict_values = my_dict.values()

# get(key[, default]): Return the value for key if key is in the dictionary, else default.
value_of_b = my_dict.get('b', 'Key not found')
value_of_d = my_dict.get('d', 'Key not found')

# pop(key[, default]): Remove the item with the given key from the dictionary and return its value.
# If key is not found, default is returned if given, otherwise KeyError is raised.
popped_value = my_dict.pop('b', 'Key not found')

# popitem(): Remove and return an arbitrary (key, value) pair from the dictionary.
popped_item = my_dict.popitem()

# update([other]): Update the dictionary with the key-value pairs from other, overwriting existing keys.
other_dict = {'c': 93, 'd': 78}
my_dict.update(other_dict)

# setdefault(key[, default]): Return the value for key if key is in the dictionary,
# else insert key with a value of default and return default.
default_value = my_dict.setdefault('e', 50)

# Print the dictionary and other relevant information
print("Original Dictionary:", my_dict)
print("Copied Dictionary:", copied_dict)
print("Dictionary items:", dict_items)
print("Dictionary keys:", dict_keys)
print("Dictionary values:", dict_values)
print("Value of 'b':", value_of_b)
print("Value of 'd':", value_of_d)
print("Popped value:", popped_value)
print("Popped item:", popped_item)
print("Updated Dictionary:", my_dict)
print("Default value for 'e':", default_value)
