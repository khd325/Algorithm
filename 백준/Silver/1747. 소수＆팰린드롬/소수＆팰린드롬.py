import sys
import math

isPrime = [True] * 1000001

isPrime[0] = False
isPrime[1] = False


for i in range(2, int(math.sqrt(1000001)) + 1):
    j = 2
    while i * j <= 1000000:
        isPrime[i * j] = False

        j += 1

n = int(sys.stdin.readline())

for i in range(n, 1000001):
    if isPrime[i] and str(i) == str(i)[::-1]:
        print(i)
        break

else:
    print(1003001)
