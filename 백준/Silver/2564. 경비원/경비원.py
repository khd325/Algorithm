import sys


def cal(d, pos):
    if d == 1:
        return pos
    elif d == 2:
        return m + n + m - pos
    elif d == 3:
        return m + n + m + n -pos
    else:
        return m + pos

m, n = map(int, sys.stdin.readline().split())

shops = int(sys.stdin.readline())

array = []

for _ in range(shops + 1):
    d, pos = map(int, sys.stdin.readline().split())
    array.append(cal(d,pos))

guard = array[-1]

total = 0

for i in range(shops):
    forward = abs(guard - array[i])
    total += min(forward, 2*(m+n)-forward)

print(total)
