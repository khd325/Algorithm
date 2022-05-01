import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())

graph = []
for _ in range(n):
    graph.append(list(map(int, sys.stdin.readline().rstrip().split())))

s, x, y = map(int, sys.stdin.readline().rstrip().split())

q = deque()

for i in range(1, k + 1):
    for u in range(n):
        for v in range(n):
            if graph[u][v] == i:
                q.append((u, v))
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(s):
    for _ in range(len(q)):
        a, b = q.popleft()

        for j in range(4):
            nx = a + dx[j]
            ny = b + dy[j]

            if nx < 0 or ny < 0 or nx >= n or ny >= n:
                continue

            if graph[nx][ny] != 0:
                continue

            graph[nx][ny] = graph[a][b]
            q.append((nx, ny))

print(graph[x-1][y-1])