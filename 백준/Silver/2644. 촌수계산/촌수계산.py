import sys

def dfs(start):
    for i in graph[start]:
        if dist[i] == -1:
            dist[i] = dist[start] + 1
            dfs(i)

n = int(sys.stdin.readline())

a, b = map(int,sys.stdin.readline().split())

dist = [-1] * (n+1)
dist[a] = 0

k = int(sys.stdin.readline())

graph = [[] for _ in range(n+1)]
for _ in range(k):
    x, y = map(int,sys.stdin.readline().split())
    graph[x].append(y)
    graph[y].append(x)


dfs(a)

print(dist[b])

