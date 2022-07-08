import sys
from collections import defaultdict

T = int(sys.stdin.readline())

for _ in range(T):
    n = int(sys.stdin.readline())

    dictionary = defaultdict(int)

    for _ in range(n):
        a,b = map(str,sys.stdin.readline().rstrip().split())

        dictionary[b] += 1

    result = 1

    for t in dictionary:
        result *= dictionary[t] + 1

    print(result - 1)
