import sys

k,n = map(int,sys.stdin.readline().split())

lan = []

for _ in range(k):
    lan.append(int(sys.stdin.readline()))

start = 1
end = max(lan)

result = 0
while start <= end:
    mid = (start + end) // 2

    temp = 0
    for i in lan:
        temp += i // mid

    if temp >= n:
        result = mid
        start = mid + 1
    else:
        end = mid - 1

print(result)