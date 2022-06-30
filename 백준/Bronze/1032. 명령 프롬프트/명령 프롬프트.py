import sys

s = set()

n = int(input())

l = list()

for _ in range(n):
    l.append(sys.stdin.readline().rstrip())

for i in range(n):
    for j in range(i+1,n):
        for k in range(len(l[i])):
            if l[i][k] != l[j][k]:
                s.add(k)

result = list(l[0])

for i in s:
    result[i] = '?'

print(''.join(result))