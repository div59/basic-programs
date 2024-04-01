'''
Write a program to return the difference between the count of odd numbers and even numbers.

Note : You are expected to write code in the countOddEvenDifference function only which will receive the first parameter as the number of items in the array and second parameter as the array itself. you are not required to take input from the console.

Example
Finding the difference between the count of odd and even numbers from a list of 5  number

Input
input 1 : 8
input 2 : 10 20 30 40 55 66 77 83

Output
-2

Explanation
The first paramter (8) is the szie of the array. Next is an array of integers. The calculation of difference between count sum of odd and even numbers is as follows:

3 (count of odd numbers) – 5 (count of even numbers) = -2
'''
def countOddEvenDifference(n,l):
    e,o=0,0
    for i in l:
        if i%2==0:
            e+=1
        else:
            o+=1
    return o-e


n=int(input())
l=list(map(int,input().split()))
print(countOddEvenDifference(n,l))