import sys

n = int(sys.stdin.readline())

for _ in range(n):
    word = list(sys.stdin.readline().rstrip().split())

    for i in word:
        print(i[::-1],end=' ')

    print()