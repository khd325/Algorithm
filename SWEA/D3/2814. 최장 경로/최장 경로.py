T = int(input())


def dfs(cnt,start):
    visited[start] = True

    global result
    if cnt > result:
        result = cnt

    for i in graph[start]:
        if not visited[i]:
            dfs(cnt+1,i)


for t in range(1, T + 1):
    n, m = map(int, input().split())

    graph = [[] * (n + 1) for _ in range(n + 1)]

    for _ in range(m):
        a, b = map(int, input().split())

        graph[a].append(b)
        graph[b].append(a)

    result = 0


    for i in range(1,n+1):
        visited = [False] * (n + 1)
        dfs(0,i)
    print("#{} {}".format(t,result+1))