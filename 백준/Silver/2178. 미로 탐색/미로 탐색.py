from collections import deque

def bfs(x,y):
    queue = deque()
    queue.append((x,y))

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if array[nx][ny] == 1:
                array[nx][ny] = array[x][y] + 1
                queue.append((nx,ny))

    print(array[n-1][m-1])



n, m = map(int, input().split())

array = list()

for i in range(n):
    array.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

bfs(0,0)