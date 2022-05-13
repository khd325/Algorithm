import sys


def turn():
    global direction
    direction -= 1

    if direction == -1:
        direction = 3


n, m = map(int, sys.stdin.readline().split())

room = []
x, y, direction = map(int, sys.stdin.readline().split())
for _ in range(n):
    room.append(list(map(int, sys.stdin.readline().split())))

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

cnt = 0

visited = [[False] * m for _ in range(n)]
visited[x][y] = True
cnt += 1

turn_time = 0

while True:
    turn()

    nx = x + dx[direction]
    ny = y + dy[direction]

    if room[nx][ny] == 0 and not visited[nx][ny]:
        visited[nx][ny] = True
        x = nx
        y = ny
        cnt += 1
        turn_time = 0
        continue
    else:
        turn_time += 1

    if turn_time == 4:
        nx = x - dx[direction]
        ny = y - dy[direction]

        if room[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0

print(cnt)
