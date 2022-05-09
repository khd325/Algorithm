import sys

array = list(sys.stdin.readline().rstrip().split("-"))

result = ''

for i in array:
    result += i[0]

print(result)