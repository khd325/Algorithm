import sys

sys.setrecursionlimit(10 ** 9)


def dfs(start):
    global d
    d += 1
    dist[start] = d

    for i in graph[start]:
        if dist[i] == 0:
            dfs(i)


n, m, r = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n + 1)]

dist = [0] * (n + 1)

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

for i in graph:
    i.sort()
d = 0
dfs(r)

for i in dist[1:]:
    print(i)