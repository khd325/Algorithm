import sys

n = int(sys.stdin.readline())

room = []

for _ in range(n):
    room.append(list(sys.stdin.readline().rstrip()))

result = [0,0]

for i in range(n):
    isPossible = True
    cnt = 0
    for j in range(n):
        if room[i][j] == '.':
            if isPossible:
                cnt += 1
            else:
                cnt += 1
                isPossible = True
        else:
            if isPossible:
                cnt = 0
                isPossible = False
            else:
                continue
        if cnt == 2:
            result[0] += 1

for i in range(n):
    isPossible = True
    cnt = 0
    for j in range(n):
        if room[j][i] == '.':
            if isPossible:
                cnt += 1
            else:
                cnt += 1
                isPossible = True
        else:
            if isPossible:
                cnt = 0
                isPossible = False
            else:
                continue
        if cnt == 2:
            result[1] += 1



print(*result)