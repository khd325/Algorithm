import sys

sys.setrecursionlimit(10 ** 9)


def dfs(x, y):
    global w_cnt
    global b_cnt

    visited[x][y] = True

    color = graph[x][y]
    if color == 'B':
        b_cnt += 1
    elif color == 'W':
        w_cnt += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and graph[nx][ny] == color:
            dfs(nx,ny)


m, n = map(int, sys.stdin.readline().split())

graph = []

for _ in range(n):
    graph.append(list(sys.stdin.readline().rstrip()))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

visited = [[False] * m for _ in range(n)]

b, w = 0, 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 'W' and not visited[i][j]:
            w_cnt = 0
            dfs(i, j)
            w += w_cnt ** 2
        elif graph[i][j] == 'B' and not visited[i][j]:
            b_cnt = 0
            dfs(i, j)
            b += b_cnt ** 2


print(w,b)