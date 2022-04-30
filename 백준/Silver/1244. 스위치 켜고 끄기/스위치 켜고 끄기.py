import sys

n = int(sys.stdin.readline())

switch = [-1] + (list(map(int, sys.stdin.readline().split())))

num = int(sys.stdin.readline())

array = []

for _ in range(num):
    a, b = map(int, sys.stdin.readline().split())
    array.append((a, b))

for x,y in array:
    if x == 1:
        for i in range(y,n+1,y):
            switch[i] = 0 if switch[i] == 1 else 1

    else:
        left = y - 1
        right = y + 1
        ran = 0

        while True:
            if left == 0 or right > n:
                break

            if switch[left] != switch[right]:
                break

            if switch[left] == switch[right]:
                ran += 1
                left -= 1
                right += 1

        for i in range(y - ran, y + ran+1):
            switch[i] = 0 if switch[i] == 1 else 1

for i in range(1,n+1):
    print(switch[i], end=' ')
    if i % 20 == 0:
        print()