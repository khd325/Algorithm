import sys

n,m = map(int,sys.stdin.readline().split())

graph = []

for _ in range(n):
    graph.append(list(sys.stdin.readline().rstrip()))

low = 99999
for i in range(n-7):
    for j in range(m-7):
        start_w = 0
        start_b = 0
        for k in range(i,i+8):
            for l in range(j,j+8):
                if (k+l)% 2 == 0: #
                    if graph[k][l] != 'W':
                        start_w += 1
                    if graph[k][l] != 'B':
                        start_b += 1
                else:
                    if graph[k][l] != 'W':
                        start_b += 1
                    if graph[k][l] != 'B':
                        start_w += 1
        low = min(low,min(start_b,start_w))


print(low)

