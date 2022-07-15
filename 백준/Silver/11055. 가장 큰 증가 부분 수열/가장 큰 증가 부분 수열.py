import sys

n = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))

dp = [0] * n

for i in range(n):
    dp[i] = arr[i]

for i in range(1, n):
   for j in range(i):
       if arr[j] < arr[i]:
           dp[i] = max(dp[i], dp[j] + arr[i])

print(max(dp))