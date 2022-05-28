import sys

c, r = map(int, sys.stdin.readline().split())
seat = int(sys.stdin.readline())

if c * r < seat:
    print(0)
    exit()

graph = [[0] * c for _ in range(r)]

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

num = 1
x = r - 1
y = 0

graph[x][y] = num
if seat == 1:
    print(y + 1, r - x)
    exit()

direction = 0
num += 1
while num <= c * r:
    nx = x + dx[direction]
    ny = y + dy[direction]

    if nx < 0 or nx >= r or ny < 0 or ny >= c:
        direction = (direction + 1) % 4
        continue

    if graph[nx][ny] != 0:
        direction = (direction + 1) % 4

    else:
        graph[nx][ny] = num
        x = nx
        y = ny

        if num == seat:
            break
        num += 1


print(y+1,r-x)
