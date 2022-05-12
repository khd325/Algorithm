import sys

sys.setrecursionlimit(10 ** 9)


def dfs(x, y):
    if x == n - 1 and y == m - 1:
        return 1

    if visited[x][y] != -1:
        return visited[x][y]

    visited[x][y] = 0

    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]

        if 0 <= nx < n and 0 <= ny < m:
            if graph[x][y] > graph[nx][ny]:
                visited[x][y] += dfs(nx, ny)

    return visited[x][y]


n, m = map(int, sys.stdin.readline().split())

cnt = 0
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
graph = []

for _ in range(n):
    graph.append(list(map(int, sys.stdin.readline().split())))

visited = [[-1] * m for _ in range(n)]

print(dfs(0, 0))

