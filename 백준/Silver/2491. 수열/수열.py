import sys

n = int(sys.stdin.readline())

array = list(map(int, sys.stdin.readline().split()))
dp1 = [1] * n
dp2 = [1] * n

for i in range(1, n):
    if array[i] >= array[i - 1]:
        dp1[i] = max(dp1[i], dp1[i - 1] + 1)
    if array[i] <= array[i - 1]:
        dp2[i] = max(dp2[i], dp2[i - 1] + 1)

print(max(max(dp1),max(dp2)))
