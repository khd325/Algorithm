import sys

a,b = map(int,sys.stdin.readline().split())

idx = 1


result = 0

while True:
    if idx > b:
        break

    for i in range(1,1001):
        if idx > b:
            break
        for j in range(i):
            if a <= idx <= b:
                result += i
                idx += 1
            else:
                idx += 1

print(result)
