import sys

n = int(sys.stdin.readline())

t = []
p = []
dp = [0] * (n + 1)
max_value = 0
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    t.append(a)
    p.append(b)


for i in range(n-1,-1,-1):

    if t[i] + i <= n:
        dp[i] = max(dp[i+t[i]] + p[i],dp[i+1])
    else:
        dp[i] = dp[i+1]

print(dp[0])