import sys

def dfs(start):
    global d
    d += 1
    visited[start] = True

    for v in graph[start]:
        if not visited[v]:
            dfs(v)



n = int(sys.stdin.readline())

graph = [[] for _ in range(n + 1)]


for i in range(1,n+1):
    graph[i].append(int(sys.stdin.readline()))

result = [0]

for i in range(1,n+1):
    visited = [False] * (n+1)
    d = 0
    dfs(i)
    result.append(d)

print(result.index(max(result[1:])))