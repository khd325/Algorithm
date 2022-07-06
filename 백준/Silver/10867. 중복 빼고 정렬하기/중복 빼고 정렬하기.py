import sys

n = int(sys.stdin.readline())

l = list(set(list(map(int,sys.stdin.readline().split()))))

l.sort()

print(*l)