import sys

n, num = map(int,sys.stdin.readline().split())

array = list()

for _ in range(n):
    array.append(int(sys.stdin.readline()))

array.sort(reverse=True)

result = 0

for coin in array:
    result += num//coin
    num %= coin

print(result)