import sys


s = set()

data = list(sys.stdin.readline().rstrip())

for i in range(1,len(data) + 1):
    for j in range(len(data) - i + 1):
        s.add(''.join(data[j:j+i]))

print(len(s))