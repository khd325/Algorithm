import sys

n, num = map(int,sys.stdin.readline().split())

list = list()

for _ in range(n):
    list.append(int(sys.stdin.readline()))

list.sort(reverse=True)


count = 0

for i in list:
    count += num // i
    num %= i

print(count)