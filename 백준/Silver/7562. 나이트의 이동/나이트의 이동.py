import sys
from collections import deque

T = int(sys.stdin.readline())

dx = [-1, -2, -2, -1, 1, 2, 2, 1]
dy = [-2, -1, 1, 2, 2, 1, -1, -2]
for _ in range(T):
    n = int(sys.stdin.readline())
    graph = [[-1] * n for _ in range(n)]


    start_x, start_y = map(int, sys.stdin.readline().split())

    end_x, end_y = map(int, sys.stdin.readline().split())

    q = deque()

    q.append((start_x, start_y))
    graph[start_x][start_y] = 0

    while q:
        x, y = q.popleft()


        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny <0 or ny >= n:
                continue

            if graph[nx][ny] == -1:
                graph[nx][ny] = graph[x][y] + 1
                if nx == end_x and ny == end_y:
                    break
                q.append((nx,ny))

    print(graph[end_x][end_y])


