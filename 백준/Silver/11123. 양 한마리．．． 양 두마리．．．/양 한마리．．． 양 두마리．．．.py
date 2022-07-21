import sys
sys.setrecursionlimit(100000)

def dfs(x, y):
    visited[x][y] = True

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m:
            if not visited[nx][ny] and graph[nx][ny] == '#':
                dfs(nx, ny)


T = int(sys.stdin.readline())

for _ in range(T):
    n, m = map(int, sys.stdin.readline().split())

    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    graph = []
    visited = [[False] * m for _ in range(n)]

    for _ in range(n):
        graph.append(list(sys.stdin.readline().rstrip()))

    count = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] == '#' and not visited[i][j]:
                dfs(i, j)
                count += 1

    print(count)
