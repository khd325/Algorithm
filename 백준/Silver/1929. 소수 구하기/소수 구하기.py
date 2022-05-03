import sys
import math

n, m = map(int,sys.stdin.readline().split())

array = [i for i in range(m+1)]

for i in range(0,n):
    array[i] = 0

array[1] = 0


for i in range(2,int(math.sqrt(m)+1)):
    j = 2
    while i*j <= m:
        array[i*j] = 0
        j += 1

for i in array:
    if i != 0:
        print(i)