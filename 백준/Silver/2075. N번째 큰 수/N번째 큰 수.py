import sys
import heapq

n = int(sys.stdin.readline())

q = []

for _ in range(n):
    nums = list(map(int,sys.stdin.readline().split()))

    if len(q) == 0:
        for num in nums:
            heapq.heappush(q,num)
    else:
        for num in nums:
            if q[0] < num:
                heapq.heappush(q,num)
                heapq.heappop(q)


print(heapq.heappop(q))