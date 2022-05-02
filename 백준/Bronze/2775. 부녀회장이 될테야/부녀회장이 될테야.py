import sys

T = int(sys.stdin.readline())

for _ in range(T):

    floor = int(sys.stdin.readline())
    no = int(sys.stdin.readline())

    li = [[0] * (no+1) for _ in range(floor+1)]

    for i in range(no+1):
        li[0][i] = i

    for i in range(1,floor+1):
        for j in range(1,no+1):
            if j == 0:
                li[i][j] = 1

            else:
                li[i][j] = li[i][j-1] + li[i-1][j]

    print(li[-1][-1])