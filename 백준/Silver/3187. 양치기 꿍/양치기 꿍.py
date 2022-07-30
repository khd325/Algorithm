import sys
from collections import deque


def bfs(x, y):
    global k
    global v

    visited[x][y] = True
    q = deque()
    q.append((x, y))

    wolf = 0
    sheep = 0

    while q:

        x, y = q.popleft()

        if graph[x][y] == 'k':
            sheep += 1

        elif graph[x][y] == 'v':
            wolf += 1

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny]:
                if graph[nx][ny] != '#':
                    q.append((nx, ny))
                    visited[nx][ny] = True
    # k: 양, v: 늑대

    if sheep > wolf:
        v -= wolf
    else:
        k -= sheep


n, m = map(int, sys.stdin.readline().split())

graph = []

for _ in range(n):
    graph.append(list(sys.stdin.readline().rstrip()))

visited = [[False] * m for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

v = 0
k = 0
for i in range(n):
    for j in range(m):
        if graph[i][j] == 'v':
            v += 1
        elif graph[i][j] == 'k':
            k += 1

for i in range(n):
    for j in range(m):
        if not visited[i][j] and graph[i][j] == ('v' or 'k'):
            bfs(i, j)

print(k, v)
