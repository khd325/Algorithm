import sys


def gcd(a, b):
    if a == 0:
        return b

    return gcd(b % a, a)


T = int(sys.stdin.readline())

for _ in range(T):
    data = list(map(int, sys.stdin.readline().split()))

    n = data[0]
    data = data[1:]
    data.sort()
    result = 0

    for i in range(n - 1):
        for j in range(i + 1, n):
            result += gcd(data[i], data[j])

    print(result)