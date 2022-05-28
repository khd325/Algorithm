import sys


def rotate():
    global direction
    direction += 1

    if direction == 4:
        direction = 0


n = int(sys.stdin.readline())
k = int(sys.stdin.readline())

graph = [[0] * n for _ in range(n)]

num = n * n
graph[0][0] = num
num -= 1

direction = 0

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
x = 0
y = 0

while num != 0:
    nx = x + dx[direction]
    ny = y + dy[direction]

    if nx < 0 or nx >= n or ny < 0 or ny >= n:
        rotate()
        continue

    if graph[nx][ny] != 0:
        rotate()
        continue

    graph[nx][ny] = num
    num -= 1
    x = nx
    y = ny

result_x = 0
result_y = 0
for i in range(n):
    for j in range(n):
        print(graph[i][j], end=' ')
        if graph[i][j] == k:
            result_x = i + 1
            result_y = j + 1
    print()

print(result_x,result_y)
