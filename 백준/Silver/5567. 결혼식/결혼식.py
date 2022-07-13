import sys
from collections import deque

n = int(sys.stdin.readline())

m = int(sys.stdin.readline())

graph = [[] for _ in range(n + 1)]
d = [-1] * (n + 1)
visited = [False] * (n + 1)

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

d[1] = 0
q = deque()

q.append(1)
visited[1] = True
while q:
    x = q.popleft()
    for i in graph[x]:
        if not visited[i]:
            visited[i] = True
            q.append(i)
            d[i] = d[x] + 1

result = 0

for i in d:
    if 1 <= i <= 2:
        result += 1

print(result)