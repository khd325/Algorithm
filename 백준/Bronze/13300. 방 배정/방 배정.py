import sys
import math

n, k = map(int, sys.stdin.readline().split())

array = [[0] * 2 for _ in range(6)]

for _ in range(n):
    s, y = map(int, sys.stdin.readline().split())

    y -= 1

    array[y][s] += 1

result = 0

for i in range(6):
    for j in range(2):
        result += math.ceil(array[i][j] / k)

print(result)