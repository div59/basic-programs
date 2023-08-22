def is_valid(x, y, M, N):
    return 0 <= x < M and 0 <= y < N

def dfs(x, y, visited, board, M, N):
    if not is_valid(x, y, M, N) or visited[x][y] or board[x][y] == 'X':
        return 0
    
    visited[x][y] = True
    count = 1
    
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    
    for i in range(4):
        new_x, new_y = x + dx[i], y + dy[i]
        count += dfs(new_x, new_y, visited, board, M, N)
    
    return count

# Read input
M, N = map(int, input().split())
board = [input().strip() for _ in range(M)]

# Calculate and print output
visited = [[False] * N for _ in range(M)]
result = dfs(0, 0, visited, board, M, N)
print(result)