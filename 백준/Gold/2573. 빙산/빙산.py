import sys
from collections import deque


def bfs(x, y):

    q = deque()
    q.append((x, y))
    while q:
        x, y = q.popleft()
        visited[x][y] = True
        cnt = 0
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m:
                if graph[nx][ny] != 0 and not visited[nx][ny]:
                    visited[nx][ny] = True
                    q.append((nx,ny))
                elif graph[nx][ny] == 0:
                    cnt += 1
        temp[x][y] = cnt



n, m = map(int, sys.stdin.readline().split())

graph = []

for _ in range(n):
    graph.append(list(map(int, sys.stdin.readline().split())))
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
day = 0
flag = False
while True:
    result = []
    temp = [[0] * m for _ in range(n)]
    visited = [[False] * m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if graph[i][j] != 0 and not visited[i][j]:
                bfs(i, j)
                result.append((i,j))

    for i in range(n):
        for j in range(m):
            if temp[i][j] != 0:
                graph[i][j] = 0 if graph[i][j] - temp[i][j] <= 0 else graph[i][j]-temp[i][j]
    if len(result) >= 2:
        break

    if len(result) == 0:
        flag = True
        break
    day += 1

print(day if not flag else 0)