import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())

graph = []

for _ in range(n):
    graph.append(list(map(int, sys.stdin.readline().split())))

cnt = 0
max_area = 0

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x,y):
    q = deque()
    q.append((x,y))

    area = 0
    while q:
        x, y = q.popleft()
        graph[x][y] = 0
        area += 1

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx,ny))

    return area

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            max_area = max(max_area,bfs(i,j))
            cnt += 1

print(cnt)
print(max_area)
