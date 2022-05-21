import sys

n = int(sys.stdin.readline())

array = list(map(int, sys.stdin.readline().split()))

dp = [0] * (n + 1)

dp[1] = array[0]

for i in range(2,n+1):
    dp[i] = array[i-1] + dp[i-1]


t = int(sys.stdin.readline())

for _ in range(t):
    a,b = map(int,sys.stdin.readline().split())

    print(dp[b] - dp[a-1])
