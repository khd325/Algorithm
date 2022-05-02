import sys

n = int(sys.stdin.readline())

data = sys.stdin.readline().rstrip()

sum = 0
for i in data:
    sum += int(i)

print(sum)