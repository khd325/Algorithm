import sys

n = int(sys.stdin.readline())

array = list(map(int, sys.stdin.readline().split()))
dp = [0] * n

dp[0] = array[0]

for i in range(1, n):
    dp[i] = max(array[i], array[i] + dp[i - 1])
    
print(max(dp))
