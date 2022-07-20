import sys
from collections import deque

r, c = map(int, sys.stdin.readline().split())

graph = []

for _ in range(r):
    graph.append(list(sys.stdin.readline().rstrip()))

visited = [[False] * c for _ in range(r)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

water = deque()
hedgehog = deque()

for i in range(r):
    for j in range(c):
        if graph[i][j] == 'X':
            visited[i][j] = True
        elif graph[i][j] == 'S':
            hedgehog.append((i, j))
            visited[i][j] = True
        elif graph[i][j] == '*':
            water.append((i, j))
            visited[i][j] = True

count = 0

while hedgehog:

    w_loop = len(water)

    for _ in range(w_loop):
        x, y = water.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < r and 0 <= ny < c:
                if graph[nx][ny] == '.':
                    water.append((nx,ny))
                    graph[nx][ny] = '*'
                    visited[nx][ny] = True

    count += 1

    h_loop = len(hedgehog)

    for _ in range(h_loop):
        x,y = hedgehog.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < r and 0 <= ny < c:
                if graph[nx][ny] == '.' and not visited[nx][ny]:
                    graph[nx][ny] = 'S'
                    graph[x][y] = '.'
                    hedgehog.append((nx,ny))
                    visited[nx][ny] = True
                elif graph[nx][ny] == 'D':
                    print(count)
                    exit()

print('KAKTUS')

