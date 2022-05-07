import sys


def dfs(x, y, l):

    if len(l) == 6:
        if l not in result:
            result.add(l)
        return

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < 5 and 0 <= ny < 5:
            dfs(nx,ny,l + graph[nx][ny])

result = set()
graph = []
cnt = 0
for _ in range(5):
    graph.append(list(map(str, sys.stdin.readline().split())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(5):
    for j in range(5):
        l = graph[i][j]
        dfs(i, j, l)

print(len(result))
