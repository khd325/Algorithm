import sys

n, m = map(int, sys.stdin.readline().split())

s = set()

for _ in range(n):
    s.add(sys.stdin.readline().rstrip())

result = 0

for _ in range(m):
    if sys.stdin.readline().rstrip() in s:
        result += 1

print(result)