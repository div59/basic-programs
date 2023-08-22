def find_band_member_id(total_members, performances, swap_positions, k):
    # Initialize the band members' positions
    band_members = list(range(1, total_members + 1))

    # Perform the given number of performances
    for swap in swap_positions:
        member_a, member_b = swap
        member_a -= 1  # Adjust for 0-based indexing
        member_b -= 1

        # Swap the positions of the two members
        band_members[member_a], band_members[member_b] = band_members[member_b], band_members[member_a]

    # Find the ID of the band member at the Kth position
    band_member_id = band_members[k - 1]  # Adjust for 0-based indexing
    return band_member_id

# Read input
total_members = int(input())
performances, swap_col = map(int, input().split())
swap_positions = [list(map(int, input().split())) for _ in range(performances)]
k = int(input())

# Call the function and print the result
result = find_band_member_id(total_members, performances, swap_positions, k)
print(result)


# There are N members in a marching band. Each member of the band has been assigned a value from 1 to N and they are arranged in ascending order of their assigned value. The band is participating in a competition in which they have to complete Q performances. After one particular performance, the two band members who were called out by the instructor had to swap positions with each other until all the Q
# performances have been performed.
# Now the instructor wants to know the ID of the band member who is at the Kth position after Q
# performances,

# Write an algorithm for the band instructor to find the ID of the band member who is at the Kth postion after Q performances.

# Input
# The first line of the input consists of an integer- totalMembers, representing the total members of the band (N).
# The second line consists of two space-separated integers- SwapMembers_row and swapMembers_col, representing the number of performances (Q)and the number of members called by the instructor after each performance (S), respectively.
# The next Q lines consist of S space-separated integers.

# SwapMembers, where each line representing the positions of the members who were called by the instructor to swap their positions.
# The last line consists of an integer- posMember, representing the position (K);
# Output
# Print an integer representing the ID of the band member who is at the kth position after Q performances.

# Constraints
# 1<= posMember <= totalMembers <=10 power 9
# 1 <= SwapMembers_row <= 10 power 5
# 1 <= SwapMembers <= totalMembers
# SwapMembers_col = 2

# Example:
# Input:
# 10
# 2 2
# 1 5
# 6 10
# 1

# Output:
# 5 