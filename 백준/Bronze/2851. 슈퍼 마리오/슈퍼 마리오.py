import sys

array = []

for _ in range(10):
    array.append(int(sys.stdin.readline()))

total = 0

d = [0] * 10

d[0] = array[0]

for i in range(1, 10):
    d[i] = d[i - 1] + array[i]

cur = 1e9
idx = 0

for i in range(1,10):
    if abs(100-d[i]) <= abs(100-d[idx]):
        idx = i
        cur = abs(100-i)

print(d[idx])