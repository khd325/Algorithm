import sys
from itertools import combinations


dwarf = []

for _ in range(9):
    dwarf.append(int(sys.stdin.readline()))


comb = combinations(dwarf,7)

for c in comb:
    if sum(c) == 100:
        for i in c:
            print(i)
        break

