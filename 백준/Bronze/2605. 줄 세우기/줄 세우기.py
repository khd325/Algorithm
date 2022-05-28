import sys

n = int(sys.stdin.readline())

array = list(map(int, sys.stdin.readline().split()))

result = []

for i in range(n):
    result.insert(i - array[i], i + 1)

print(*result)
