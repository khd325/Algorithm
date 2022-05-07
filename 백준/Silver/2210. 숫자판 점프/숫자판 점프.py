import sys

sys.setrecursionlimit(10 ** 9)


def dfs(x, y, depth):
    if depth == 6:
        temp = ''.join(array)
        if temp not in result:
            result.append(temp)
        return

    if 0 <= x < 5 and 0 <= y < 5:
        array[depth] = graph[x][y]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx, ny, depth + 1)


result = []
graph = []
array = [''] * 6
cnt = 0
for _ in range(5):
    graph.append(list(map(str, sys.stdin.readline().split())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for i in range(5):
    for j in range(5):
        dfs(i, j, 0)

print(len(result))
