from itertools import combinations

n, total = map(int,input().split())
arr = list(map(int,input().split()))

arr.sort()
temp=0
for i in combinations(arr,3):
    if temp <= sum(i) and sum(i) <= total:
        temp = sum(i)

print(temp)
