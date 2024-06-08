
'''Input: s=”this is an amazing program”
Output: “program amazing an is this”
'''

s=input().split()
for i in range(len(s)-1,-1,-1):
    print(s[i],end=" ")
    
# def reverse_words(s):
#     words = s.split()  # Split the string into words
#     reversed_words = words[::-1]  # Reverse the list of words
#     reversed_string = ' '.join(reversed_words)  # Join the reversed words back into a string
#     return reversed_string

# # Example usage
# original_string = "The quick brown fox jumps over the lazy dog"
# reversed_string = reverse_words(original_string)
# print(reversed_string)
