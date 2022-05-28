import sys

board = [[0] * 1001 for _ in range(1001)]

n = int(sys.stdin.readline())

for i in range(1, n + 1):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

    for u in range(x1,x1+x2):
        for v in range(y1,y1+y2):
            board[u][v] = i


for i in range(1,n+1):
    cnt = 0

    for u in range(1001):
        for v in range(1001):
            if board[u][v] == i:
                cnt += 1

    print(cnt)
