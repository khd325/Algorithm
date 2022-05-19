import sys

n, k = map(int, sys.stdin.readline().split())

array = [(0, 0)]

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())

    array.append((a, b))

dp = [[0] * (k + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    weight = array[i][0]
    value = array[i][1]
    for j in range(1, k + 1):
        if j < weight:
            dp[i][j] = dp[i - 1][j]
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weight] + value)

print(dp[-1][-1])
