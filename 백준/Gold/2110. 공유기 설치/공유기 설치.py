import sys

n, c = map(int, sys.stdin.readline().split())
house = []

for _ in range(n):
    house.append(int(sys.stdin.readline()))

house.sort()


start = 1
end = house[-1] - house[0]

while start <= end:
    mid = (start + end) // 2
    current = house[0]
    count = 1

    for i in house:
        if i >= current + mid:
            count += 1
            current = i

    if count >= c:
        start = mid + 1
        answer = mid
    else:
        end = mid - 1

print(answer)
