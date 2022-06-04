import sys
from collections import deque


def bfs(start):
    dist = [0] * (n + 1)

    q = deque()
    q.append(start)

    while q:
        x = q.popleft()
        visited[x] = True

        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                dist[i] = dist[x] + 1
                q.append(i)
    return sum(dist)


n, m = map(int, sys.stdin.readline().split())

result = 0

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

min_dist = int(1e9)

for i in range(1, n + 1):
    visited = [False] * (n + 1)
    dist = bfs(i)

    if min_dist > dist:
        min_dist = dist
        result = i
print(result)
