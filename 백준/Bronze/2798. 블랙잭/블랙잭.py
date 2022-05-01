import sys

n,m = map(int,sys.stdin.readline().split())

arr = list(map(int,sys.stdin.readline().split()))


max_num = 0

for i in range(n-2):
    for j in range(i+1,n-1):
        for k in range(j+1,n):
            num = arr[i] + arr[j] + arr[k]
            if max_num < num <= m:
                max_num = num

print(max_num)