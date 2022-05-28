import sys

def row_check():
    temp = 0
    for i in range(5):
        cnt = 0
        for j in range(5):
            if check[i][j]:
                cnt += 1
        if cnt == 5:
            temp += 1

    return temp


def col_check():
    temp = 0
    for i in range(5):
        cnt = 0
        for j in range(5):
            if check[j][i]:
                cnt += 1
        if cnt == 5:
            temp += 1

    return temp

def d_check1():
    temp = 0
    cnt = 0
    for i in range(5):
        if check[i][i]:
            cnt += 1
    if cnt == 5:
        temp += 1

    return temp

def d_check2():
    temp = 0
    cnt = 0
    for i in range(5):
        if check[i][5-i-1]:
            cnt += 1
    if cnt == 5:
        temp += 1
    return temp


board = []

for _ in range(5):
    board.append(list(map(int, sys.stdin.readline().split())))


check = [[False] * 5 for _ in range(5)]

time = 0

for _ in range(5):
    li = list(map(int, input().split()))

    for n in li:

        time += 1
        cnt = 0
        for i in range(5):
            for j in range(5):
                if board[i][j] == n:
                    check[i][j] = True

                    cnt += row_check()

                    if cnt >= 3:
                        print(time)
                        exit(0)
                    cnt += col_check()

                    if cnt >= 3:
                        print(time)
                        exit(0)
                    cnt += d_check1()

                    if cnt >= 3:
                        print(time)
                        exit(0)
                    cnt += d_check2()

                    if cnt >= 3:
                        print(time)
                        exit(0)
