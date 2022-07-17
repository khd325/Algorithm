import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())

q = deque()
visited = [0 for _ in range(100001)]

q.append(n)

while q:
    x = q.popleft()

    if x == k:
        print(visited[x])
        break

    for pos in (x - 1, x + 1, x * 2):
       if (0 <= pos <= 100000) and visited[pos] == 0:
           visited[pos] = visited[x] + 1
           q.append(pos)


