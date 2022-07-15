import sys

dp = [[0] * (31) for _ in range(31)]

for i in range(1, 31):
    dp[1][i] = i

for i in range(2, 31):
    for j in range(1, 31):
        dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1]

T = int(sys.stdin.readline())

for _ in range(T):
    n, m = map(int, sys.stdin.readline().split())
    print(dp[n][m])