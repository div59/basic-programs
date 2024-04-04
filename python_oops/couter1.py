from collections import Counter

# Creating a Counter
c = Counter('hello')
print(c)  # Output: Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
for i in c.keys():
    if c[i]==1:
        print(i)

# Counting occurrences of elements in a list
words = ['apple', 'banana', 'apple', 'orange', 'banana', 'apple']
word_counts = Counter(words)
print(word_counts)  # Output: Counter({'apple': 3, 'banana': 2, 'orange': 1})



c1 = Counter('hello')
c2 = Counter('world')

# Addition
c3 = c1 + c2
print(c3)  # Output: Counter({'l': 3, 'o': 2, 'h': 1, 'e': 1, 'w': 1, 'r': 1, 'd': 1})

# Subtraction
c4 = c1 - c2
print(c4)  # Output: Counter({'h': 1, 'e': 1, 'l': 1})

# Intersection
c5 = c1 & c2
print(c5)  # Output: Counter({'l': 1, 'o': 1})

# Union
c6 = c1 | c2
print(c6)  # Output: Counter({'h': 1, 'e': 1, 'l': 1, 'o': 1, 'w': 1, 'r': 1, 'd': 1})
