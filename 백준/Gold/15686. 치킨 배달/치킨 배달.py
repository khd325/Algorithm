import sys
from itertools import combinations

n, m = map(int, sys.stdin.readline().split())

chicken = []
house = []

for r in range(n):
    li = list(map(int, input().split()))
    for c in range(n):

        if li[c] == 1:
            house.append((r, c))
        elif li[c] == 2:
            chicken.append((r, c))

candidates = list(combinations(chicken, m))


def get_sum(candidate):
    result = 0
    for hx, hc in house:
        temp = int(1e9)

        for cx, cy in candidate:
            temp = min(temp, abs(hx - cx) + abs(hc - cy))

        result += temp
    return result


result = 1e9
for candidate in candidates:
    result = min(result,get_sum(candidate))

print(result)
