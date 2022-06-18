import sys
from collections import deque

n = int(sys.stdin.readline())

r1, c1, r2, c2 = map(int, sys.stdin.readline().split())
visited = [[False] * n for _ in range(n)]
board = [[-1] * n for _ in range(n)]

board[r1][c1] = 0

dr = [-2, -2, 0, 0, 2, 2]
dc = [-1, 1, -2, 2, -1, 1]

q = deque()

q.append((r1, c1))
visited[r1][c1] = True


while q:
    r, c = q.popleft()

    for i in range(6):
        nr = r + dr[i]
        nc = c + dc[i]

        if nr < 0 or nr >= n or nc < 0 or nc >= n:
            continue
        elif (0 <= nr < n and 0 <= nc < n) and not visited[nr][nc]:
            visited[nr][nc] = True
            board[nr][nc] = board[r][c] + 1
            q.append((nr, nc))


print(board[r2][c2])