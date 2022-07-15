import sys

n = int(sys.stdin.readline())

card = [0] + list(map(int, sys.stdin.readline().split()))

dp = [0] * (n + 1)

dp[1] = card[1]

for i in range(2, n + 1):
    for j in range(1, i + 1):
        if dp[i] < dp[i-j] + card[j]:
            dp[i] = dp[i-j] + card[j]
print(dp[n])