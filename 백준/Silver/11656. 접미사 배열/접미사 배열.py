import sys

result = []

data = list(sys.stdin.readline().rstrip())

for i in range(len(data)):
    result.append(''.join(data[i:]))

result.sort()

for i in result:
    print(i)