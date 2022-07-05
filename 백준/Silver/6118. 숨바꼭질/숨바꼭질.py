import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())

    graph[a].append(b)
    graph[b].append(a)

for i in graph:
    i.sort()

dist = [0] * (n + 1)
visited = [False] * (n+1)
q = deque()

q.append(1)
visited[1] = True

while q:
    x = q.popleft()

    for i in graph[x]:
        if not visited[i]:
            dist[i] = dist[x] + 1
            visited[i] = True
            q.append(i)


print(dist.index(max(dist)),max(dist),dist.count(max(dist)))

