import sys
from collections import deque


n, m, k, x = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n+1)]
dist = [-1] * (n+1)

for _ in range(m):
    a, b = map(int,sys.stdin.readline().split())
    graph[a].append(b)


def bfs(start):
    q = deque()
    q.append(x)

    while q:
        v = q.popleft()

        for i in graph[v]:
            if dist[i] == -1:
                dist[i] = dist[v] + 1
                q.append(i)


dist[x] = 0
bfs(x)

result = []

for i in range(1,n+1):
    if dist[i] == k:
        result.append(i)

if len(result) == 0:
    print(-1)
else:
    for i in result:
        print(i)
