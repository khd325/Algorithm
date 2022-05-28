import sys

x, y = map(int, sys.stdin.readline().split())

z = int((y*100)/x)

if z >= 99:
    print(-1)
else:
    answer = 0
    start = 1
    end = x
    while start <= end:
        mid = (start + end) // 2
        if int(((y+mid)*100) / (x+mid)) <= z:
            start = mid + 1
        else:

            answer = mid
            end = mid - 1

    print(answer)

