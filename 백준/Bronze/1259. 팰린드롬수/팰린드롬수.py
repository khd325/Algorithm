import sys

while True:
    n = list(sys.stdin.readline().rstrip())

    if n[0] == '0':
        break

    if n[::] == n[::-1]:
        print("yes")
    else:
        print("no")
