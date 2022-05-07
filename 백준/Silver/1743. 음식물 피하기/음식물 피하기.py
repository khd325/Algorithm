import sys
sys.setrecursionlimit(10**9)

def dfs(x, y):
    global cnt
    graph[x][y] = 0
    cnt += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 1 <= nx <= n and 1 <= ny <= m:
            if graph[nx][ny] == 1:
                dfs(nx,ny)


n, m, k = map(int, sys.stdin.readline().split())

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

graph = [[0] * (m + 1) for _ in range(n + 1)]

for _ in range(k):
    a, b = map(int, sys.stdin.readline().split())

    graph[a][b] = 1

max_result = 0

for i in range(1, n + 1):
    for j in range(1, m + 1):
        if graph[i][j] == 1:
            cnt = 0
            dfs(i,j)
            max_result = max(cnt, max_result)


print(max_result)
