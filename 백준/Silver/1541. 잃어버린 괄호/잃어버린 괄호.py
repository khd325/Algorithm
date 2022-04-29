import sys

n = list(sys.stdin.readline().rstrip().split("-"))

temp = []

for i in n:
    temp.append(i.split("+"))

result = 0

for i in range(len(temp)):
    if i == 0:
        for j in temp[i]:
            result += int(j)
    else:
        for j in temp[i]:
            result -= int(j)

print(result)