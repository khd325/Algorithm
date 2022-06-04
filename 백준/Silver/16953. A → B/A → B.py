import sys
from collections import deque


a,b = map(int,sys.stdin.readline().split())

q = deque()

q.append(a)
cnt = 0
flag = False
while q:
    l = len(q)

    if flag:
        break

    if l > 0:
        for i in range(l):
            x = q.popleft()
            if x == b:
                flag = True
                break
            if x * 2 <= b:
                q.append(x*2)
            if int(str(x) + '1') <= b:
                q.append(int(str(x) + '1'))

    cnt += 1

if flag:
    print(cnt)
else:
    print(-1)