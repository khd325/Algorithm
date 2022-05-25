import sys

n = int(sys.stdin.readline())

array = list(map(int, sys.stdin.readline().split()))

array.reverse()

dp = [1] * n

for i in range(1, n):
    for j in range(i):
        if array[i] > array[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(n - max(dp))
