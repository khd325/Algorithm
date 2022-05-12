import sys

data = sys.stdin.readline().rstrip()

for i in range(len(data) // 10):
    print(data[10 * i:10 * i + 10])

print(data[(10 * (len(data) // 10)):])
