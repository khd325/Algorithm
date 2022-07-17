import sys

data = sys.stdin.readline().rstrip()

print(1 if data[::] == data[::-1] else 0)