import sys


def check():

    cnt = 1

    for i in range(n):
        tmp = 1
        for j in range(n - 1):
            if board[i][j] == board[i][j + 1]:
                tmp += 1
            else:
                tmp = 1

            if tmp > cnt:
                cnt = tmp

    for i in range(n):
        tmp = 1
        for j in range(n-1):
            if board[j][i] == board[j+1][i]:
                tmp += 1
            else:
                tmp = 1

            if tmp > cnt:
                cnt = tmp
    return cnt

board = []

n = int(sys.stdin.readline())

for _ in range(n):
    board.append(list(sys.stdin.readline().rstrip()))

result = 0

for i in range(n):
    for j in range(1, n):
        if board[i][j] != board[i][j - 1]:
            board[i][j], board[i][j - 1] = board[i][j - 1], board[i][j]
            result = max(result,check())
            board[i][j], board[i][j - 1] = board[i][j - 1], board[i][j]

for i in range(n):
    for j in range(n-1):
        if board[j][i] != board[j+1][i]:
            board[j][i], board[j+1][i] = board[j+1][i], board[j][i]
            result = max(result,check())
            board[j][i], board[j+1][i] = board[j+1][i], board[j][i]

print(result)