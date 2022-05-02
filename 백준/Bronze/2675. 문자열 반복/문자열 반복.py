import sys

T = int(sys.stdin.readline())

for _ in range(T):
    a, b = map(str, sys.stdin.readline().rstrip().split())
    a = int(a)
    result = ""
    for i in b:
        result += i*a
    print(result)