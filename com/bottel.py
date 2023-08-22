def num_bottles_to_reach_4(coins):
    bottles_crossed = 0

    while coins != 4:
        if coins % 2 == 0:
            coins //= 2
        else:
            coins = coins * 3 + 1
        
        bottles_crossed += 1

    return bottles_crossed - 1

# Read input
coins = int(input())

# Calculate and print output
result = num_bottles_to_reach_4(coins)

# result -= 1
    
print(result)