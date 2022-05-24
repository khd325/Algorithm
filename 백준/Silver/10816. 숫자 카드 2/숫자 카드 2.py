import sys
from collections import Counter

n = int(sys.stdin.readline())
has = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
order = list(map(int, sys.stdin.readline().split()))

has = Counter(has)
for i in order:
    print(has[i],end=' ')
