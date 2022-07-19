import sys

n, k = map(int, sys.stdin.readline().split())

li = list(map(int,sys.stdin.readline().split()))

li.sort()

result = []

for i in range(1,n):
    result.append(li[i] - li[i-1])

result.sort()

print(sum(result[:n-k]))