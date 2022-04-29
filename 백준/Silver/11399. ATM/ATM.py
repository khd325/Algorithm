import sys

n = int(sys.stdin.readline())

array = list(map(int,sys.stdin.readline().split()))

array.sort()

result  = 0

for i in range(n):
    result += sum(array[:i+1])

print(result)
