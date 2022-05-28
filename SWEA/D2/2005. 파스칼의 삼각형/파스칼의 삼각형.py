T = int(input())

for t in range(1, T + 1):
    n = int(input())

    graph = [[0]*i for i in range(1,n+1)]

    for i in range(len(graph)):
        graph[i][0] = 1
        graph[i][-1] = 1

    for i in range(1,len(graph)):
        for j in range(len(graph[i])):
            if graph[i][j] == 0:
                graph[i][j] = graph[i-1][j-1] + graph[i-1][j]

    print("#{}".format(t))
    for i in range(len(graph)):
        print(*graph[i])

