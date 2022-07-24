import sys
from collections import deque


def bfs():
    visited = [[False] * m for _ in range(n)]

    q = deque()

    q.append((0, 0))
    visited[0][0] = True
    cnt = 0

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny]:
                if graph[nx][ny] == 0:
                    visited[nx][ny] = True
                    q.append((nx,ny))
                else:
                    graph[nx][ny] = 0
                    cnt += 1
                    visited[nx][ny] = True
    result.append(cnt)
    return cnt

n, m = map(int, sys.stdin.readline().split())

graph = []

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(n):
    graph.append(list(map(int, sys.stdin.readline().split())))

time = 0
result = []

while True:
    if bfs() == 0:
        break
    time += 1

print(time)
print(result[-2])