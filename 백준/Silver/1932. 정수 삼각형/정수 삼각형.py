import sys

n = int(sys.stdin.readline())

array = []

for _ in range(n):
    array.append(list(map(int, sys.stdin.readline().split())))

for i in range(n - 2, -1, -1):
    for j in range(len(array[i])):
        if j == 0:
            array[i][j] = array[i][j] + max(array[i + 1][0], array[i + 1][1])
        elif j == len(array[i]) - 1:
            array[i][j] = array[i][j] + max(array[i + 1][len(array[i]) - 1], array[i + 1][len(array[i])])
        else:
            array[i][j] = array[i][j] + max(array[i+1][j],array[i+1][j+1])

print(array[0][0])
