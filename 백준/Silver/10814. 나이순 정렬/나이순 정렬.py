import sys

n = int(sys.stdin.readline())

array = []

for _ in range(n):
    age, name = map(str,sys.stdin.readline().rstrip().split())
    array.append((int(age),name))


array.sort(key=lambda x: x[0])

for i in array:
    print(i[0], i[1])