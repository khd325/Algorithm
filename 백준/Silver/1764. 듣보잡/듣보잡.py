import sys

n,m = map(int,sys.stdin.readline().split())

a = []
b = []
for _ in range(n):
    a.append(sys.stdin.readline().rstrip())

for _ in range(m):
    b.append(sys.stdin.readline().rstrip())

a = set(a)
b = set(b)

result = list(a.intersection(b))

result.sort()

print(len(result))

for i in result:
    print(i)