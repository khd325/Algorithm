import sys
import math

m = int(sys.stdin.readline())
n = int(sys.stdin.readline())


result = []

for i in range(m,n+1):
    for j in range(1,int(math.sqrt(i)+1)):
        if j * j == i:
            result.append(i)

if len(result) == 0:
    print(-1)
else:
    print(sum(result))
    print(min(result))