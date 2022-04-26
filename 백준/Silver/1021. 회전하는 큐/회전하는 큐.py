import sys
from collections import deque

n, m = map(int,sys.stdin.readline().split())

array = list(map(int,sys.stdin.readline().rstrip().split()))
q = deque(i for i in range(1,n+1))
count = 0

for i in array:
    while True:
        if i == q[0]:
            q.popleft()
            break
        else:
            if q.index(i) < len(q)/2:
                while q[0] != i:
                    q.append(q.popleft())
                    count += 1
            else:
                while q[0] != i:
                    q.appendleft(q.pop())
                    count += 1
print(count)