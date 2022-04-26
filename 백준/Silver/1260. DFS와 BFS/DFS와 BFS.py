import sys
from collections import deque


def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')

    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)


def bfs(graph, v, visited):
    q = deque()
    q.append(v)

    while q:
        x = q.popleft()
        visited[x] = True
        print(x, end=' ')
        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                q.append(i)


n, m, v = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (n + 1)

for i in range(1, n + 1):
    graph[i].sort()

dfs(graph, v, visited)
print()
visited = [False] * (n + 1)
bfs(graph,v,visited)