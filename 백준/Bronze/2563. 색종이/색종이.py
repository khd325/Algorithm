import sys

board = [[0] * 101 for _ in range(101)]
n = int(sys.stdin.readline())

for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())

    for i in range(x, x + 10):
        for j in range(y, y + 10):
            board[i][j] = 1

cnt = 0
for i in range(101):
    for j in range(101):
        if board[i][j] == 1:
            cnt += 1

print(cnt)