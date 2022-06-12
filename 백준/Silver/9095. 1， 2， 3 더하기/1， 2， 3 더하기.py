import sys


dp = [0] * 11

dp[1] = 1
dp[2] = 2
dp[3] = 4

for i in range(4,11):
    dp[i] = sum(dp[i-3:i])


n = int(sys.stdin.readline())

for _ in range(n):
    num = int(sys.stdin.readline())

    print(dp[num])