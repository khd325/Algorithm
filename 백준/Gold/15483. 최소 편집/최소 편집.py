import sys

s = list(sys.stdin.readline().rstrip())
t = list(sys.stdin.readline().rstrip())

n = len(s)
m = len(t)
dp = [[0] * (m + 1) for _ in range(n + 1)]


for i in range(1, n + 1):
    dp[i][0] = i

for i in range(1, m + 1):
    dp[0][i] = i

for i in range(1, n + 1):
    for j in range(1, m + 1):

        if s[i - 1] == t[j - 1]:
            dp[i][j] = dp[i - 1][j - 1]
        else:
            dp[i][j] = min(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1]) + 1

print(dp[n][m])