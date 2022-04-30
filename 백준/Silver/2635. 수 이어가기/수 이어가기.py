import sys

n = int(sys.stdin.readline())

result = []
length = 0
for i in range(1,n+1):
    temp = []
    temp.append(n)
    temp.append(i)
    idx = 2
    while temp[idx-2] - temp[idx-1] >= 0:
        temp.append(temp[idx-2] - temp[idx-1])
        idx += 1

    if len(temp) > length:
        length = len(temp)
        result = [i for i in temp]

print(length)
print(*result)


