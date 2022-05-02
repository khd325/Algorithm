import sys

n = int(sys.stdin.readline())

temp = 1

if n == 1:
    step = 0
else:
    step = 1
    while True:
        temp += 6 * step

        if temp >= n:
            break

        step += 1

print(step+1)

