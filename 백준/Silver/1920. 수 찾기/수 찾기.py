import sys

n = int(sys.stdin.readline())

has = list(map(int,sys.stdin.readline().split()))

m = int(sys.stdin.readline())

order = list(map(int,sys.stdin.readline().split()))

has = set(has)

for i in order:
    if i in has:
        print(1)
    else:
        print(0)