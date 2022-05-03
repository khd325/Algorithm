import sys
import math

array = [i for i in range(10001)]

array[0], array[1] = 0, 0
for i in range(2, int(math.sqrt(10000) + 1)):
    j = 2
    while i * j <= 10000:
        array[i * j] = 0
        j += 1


T = int(sys.stdin.readline())

for _ in range(T):

    n = int(sys.stdin.readline())
    b = n//2

    for j in range(b,1,-1):
        if array[n-j] != 0 and array[j] != 0:
            print(j,n-j)
            break




