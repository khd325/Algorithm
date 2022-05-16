import sys

n = int(sys.stdin.readline())

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())

    c = a % 10

    if c == 0:
        print(10)
    elif c in [1,5,6]:
        print(c)
    elif c in [4,9]:
        if b % 2 == 0:
            print(c ** 2 % 10)
        else:
            print(c)
    else:
        if b % 4 == 0:
            print(c ** 4 % 10)
        else:
            print(c ** (b % 4) % 10)
