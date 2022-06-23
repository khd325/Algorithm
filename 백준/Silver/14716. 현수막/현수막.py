import sys
from collections import deque


def dfs(x, y):
    q = deque()
    q.append((x, y))

    while q:
        x,y = q.popleft()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx,ny))

    return


n, m = map(int, sys.stdin.readline().split())

graph = []
for _ in range(n):
    graph.append(list(map(int,sys.stdin.readline().split())))
result = 0

dx = [-1, -1, -1, 0, 1, 1, 1, 0]
dy = [-1, 0, 1, 1, 1, 0, -1, -1]

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            dfs(i, j)
            result += 1

print(result)