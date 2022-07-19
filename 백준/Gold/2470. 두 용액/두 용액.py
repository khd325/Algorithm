import math
import sys

n = int(sys.stdin.readline())

liquid = list(map(int, sys.stdin.readline().split()))

liquid.sort()

tmp = 2e9 + 1

left = 0
right = n - 1

result = []
while left < right:
    l = liquid[left]
    r = liquid[right]

    total = l + r

    if abs(total) < tmp:
        tmp = abs(total)
        result = [l, r]

    if total < 0:
        left += 1
    else:
        right -= 1

print(*result)