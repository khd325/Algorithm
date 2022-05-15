import sys
from collections import deque


def bfs(x, y):
    q = deque()
    q.append((x, y))
    visited[x][y] = True
    flag = False

    while q:
        x,y = q.popleft()


        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and graph[nx][ny] == 0:
                visited[nx][ny] = True
                q.append((nx,ny))
                if nx == n-1:
                    flag = True
                    break

    return flag



n, m = map(int, sys.stdin.readline().split())

graph = []

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(n):
    graph.append(list(map(int, sys.stdin.readline().rstrip())))

visited = [[False] * m for _ in range(n)]

check = False
for i in range(m):
    if graph[0][i] == 0 and not visited[0][i]:
        if bfs(0, i):
            print("YES")
            check = True
            break

if not check:
    print("NO")