import sys

graph = [[0] * 101 for _ in range(101)]

count = 0
for _ in range(4):
    y_1, x_1, y_2, x_2 = map(int, sys.stdin.readline().split())
    x_1 = 100 - x_1
    x_2 = 100 - x_2

    for x in range(x_2,x_1):
        for y in range(y_1,y_2):
            if graph[x][y] == 0:
                graph[x][y] = 1
                count += 1

print(count)