import sys
sys.setrecursionlimit(10**9)

def dfs(x,y):
    global num

    if x < 0 or y < 0 or x >= m or y >= n:
        return False

    if graph[x][y] == 1:
        return False

    if graph[x][y] == 0:
        graph[x][y] = 1
        num += 1
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx,ny)



m, n, k = map(int, sys.stdin.readline().split())

graph = [[0] * n for _ in range(m)]

for _ in range(k):
    x_1, y_1, x_2, y_2 = map(int, sys.stdin.readline().split())
    for i in range(m - y_2, m - y_1):
        for j in range(x_1, x_2):
            graph[i][j] = 1


count = 0
li = []

dx = [-1,1,0,0]
dy = [0,0,-1,1]

for i in range(m):
    for j in range(n):
        if graph[i][j] == 0:
            num = 0
            dfs(i,j)
            count += 1
            li.append(num)


li.sort()
print(count)
print(*li)