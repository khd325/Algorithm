import sys

n = int(input())

array = []
for i in range(n):
    x, y = map(int, sys.stdin.readline().split())
    array.append((x, y))

array.sort(key=lambda cor: (cor[0], cor[1]))

for i in array:
    print(i[0],i[1])