import sys

m = int(sys.stdin.readline())
n = int(sys.stdin.readline())

array = []

for i in range(m,n+1):
    if i == 1:
        continue

    flag = True
    for j in range(2,i):
        if i % j == 0:
            flag = False
            break

    if flag:
        array.append(i)

if len(array) == 0:
    print(-1)
else:
    print(sum(array))
    print(array[0])