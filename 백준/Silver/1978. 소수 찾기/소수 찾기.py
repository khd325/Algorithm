import sys

n = int(sys.stdin.readline())

li = list(map(int,sys.stdin.readline().split()))

count = 0
for i in li:
    flag = True
    if i == 1:
        continue
    else:
        for j in range(2,i):
            if i % j == 0:
                flag = False
                break
        if flag:
            count += 1

print(count)