import sys

n = int(sys.stdin.readline())

list = [25, 10, 5, 1]

for _ in range(n):
    c = int(sys.stdin.readline())

    for i in list:
        print(c // i,end = ' ')
        c %= i
    print()