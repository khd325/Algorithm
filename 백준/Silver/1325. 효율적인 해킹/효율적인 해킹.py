import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())

graph = [[] * (n + 1) for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())

    graph[b].append(a)

result = []
for i in range(1, n + 1):
    q = deque()
    q.append(i)
    visited = [False] * (n + 1)
    cnt = 0
    while q:
        v = q.popleft()
        visited[v] = True
        for x in graph[v]:
            if not visited[x]:
                visited[x] = True
                q.append(x)
                cnt += 1
    result.append((i, cnt))

result.sort(key=lambda x: (-x[1], x[0]))

max_cnt = result[0][1]

for a,b in result:
    if b == max_cnt:
        print(a)