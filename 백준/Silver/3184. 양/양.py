import sys

sys.setrecursionlimit(10**9)
def dfs(x,y):
    visited[x][y] = True

    if graph[x][y] == 'v':
        cnt_array[0] += 1
    elif graph[x][y] == 'o':
        cnt_array[1] += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m:
            if graph[nx][ny] != '#' and not visited[nx][ny]:
                dfs(nx,ny)


n, m = map(int, sys.stdin.readline().split())

graph = []

for _ in range(n):
    graph.append(list(sys.stdin.readline().rstrip()))

wolf = 0
sheep = 0
for i in range(n):
    for j in range(m):
        if graph[i][j] == 'v':
            wolf += 1
        elif graph[i][j] == 'o':
            sheep += 1


visited = [[False] * m for _ in range(n)]

dx = [-1,1,0,0]
dy = [0,0,-1,1]
cnt_array = [0] * 2
for i in range(n):
    for j in range(m):
        if graph[i][j] == 'v':
            cnt_array[0],cnt_array[1] = 0,0
            dfs(i, j)
            if cnt_array[0] >= cnt_array[1]:
                sheep -= cnt_array[1]
            else:
                wolf -= cnt_array[0]

print(sheep,wolf)