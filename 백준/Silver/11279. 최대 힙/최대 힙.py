import sys
import heapq

q = []

n = int(sys.stdin.readline())

for _ in range(n):
    x = int(sys.stdin.readline())

    if x == 0:
        if len(q) == 0:
            print(0)
            continue
        else:
            a = heapq.heappop(q)
            print(-a)
            continue
    else:
        heapq.heappush(q,-x)

