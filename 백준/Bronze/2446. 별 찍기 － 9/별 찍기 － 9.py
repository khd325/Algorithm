import sys


n = int(sys.stdin.readline())

for i in range(n):
    for j in range(i):
        print(" ",end='')
    print("*"*(2*(n-i)-1))

for i in range(n-2,-1,-1):
    for j in range(i):
        print(" ",end='')
    print("*"*(2*(n-i)-1))
