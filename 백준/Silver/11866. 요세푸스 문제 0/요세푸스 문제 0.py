import sys
from collections import deque


n, k = map(int,sys.stdin.readline().split())

q = deque()

for i in range(1,n+1):
    q.append(i)

count = 0

print("<",end='')

while len(q) > 1:
    for i in range(k-1):
        q.append(q.popleft())

    print(q.popleft(),end=", ")

print(q.popleft(),end=">")