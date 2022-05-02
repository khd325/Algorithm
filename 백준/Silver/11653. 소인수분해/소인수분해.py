import sys

n = int(sys.stdin.readline())

array = []

if n == 1:
    pass
else:
    while True:
        if n == 1:
            break
        for i in range(2,n+1):
            if n % i == 0:
                array.append(i)
                n //= i
                break

    for i in array:
        print(i)