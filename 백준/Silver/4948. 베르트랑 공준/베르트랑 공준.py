import sys
import math

num = 123456

array = [True for _ in range(num * 2 + 1)]

array[0], array[1] = False, False

for i in range(2,int(math.sqrt(num*2)+1)):
    j = 2
    while i * j <= num*2:
        array[i*j] = False
        j += 1

while True:
    n = int(sys.stdin.readline())

    if n == 0:
        break

    print(array[n+1:n*2+1].count(True))