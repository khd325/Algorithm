import sys
from itertools import combinations

n,k = map(int,sys.stdin.readline().split())

array = [i for i in range(n)]

print(len(list(combinations(array,k))))