import sys
from collections import deque

n, m = map(int,sys.stdin.readline().split())

room = []

for _ in range(n):
    room.append(list(sys.stdin.readline().rstrip()))

result = 0
for i in range(n):
    flag = False
    for j in range(m):
        if room[i][j] == '-':
            if flag:
                continue
            else:
                flag = True
                result += 1
        else:
            flag = False

for i in range(m):
    flag = False
    for j in range(n):
        if room[j][i] == '|':
            if flag:
                continue
            else:
                flag = True
                result += 1
        else:
            flag = False
print(result)