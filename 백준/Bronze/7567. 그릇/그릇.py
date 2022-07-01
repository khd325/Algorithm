import sys

data = sys.stdin.readline().rstrip()

current = data[0]
result = 10

for i in data[1:]:
    if i == current:
        result += 5
    else:
        current = i
        result += 10

print(result)